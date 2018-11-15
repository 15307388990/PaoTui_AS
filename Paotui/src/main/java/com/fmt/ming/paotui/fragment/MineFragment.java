package com.fmt.ming.paotui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.swipe.SwipeLayout;
import com.fmt.ming.paotui.R;
import com.fmt.ming.paotui.activity.ChangePasswordActivity;
import com.fmt.ming.paotui.activity.LoginActivity;
import com.fmt.ming.paotui.activity.MobilePhoneActivity;
import com.fmt.ming.paotui.activity.MoneyActivity;
import com.fmt.ming.paotui.activity.PersonalActivity;
import com.fmt.ming.paotui.activity.SetActivity;
import com.fmt.ming.paotui.activity.WebviewActivity;
import com.fmt.ming.paotui.base.BaseFragment;
import com.fmt.ming.paotui.bean.StoreBean;
import com.fmt.ming.paotui.config.Const;
import com.fmt.ming.paotui.dialog.PromptDialog;
import com.fmt.ming.paotui.utils.ImageLoaderUtil;
import com.fmt.ming.paotui.utils.ParamTools;
import com.fmt.ming.paotui.utils.Tools;
import com.fmt.ming.paotui.view.CircleImageView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * 我的
 */
@SuppressLint("ValidFragment")
public class MineFragment extends BaseFragment {

    private CircleImageView myicon;//头像
    private TextView tv_name, tv_price, tv_number, tv_signature;//名字  销售额 数量  签名
    private ImageView iv_magess, iv_set;
    private RelativeLayout rl_data;
    private ImageView iv_img;
    private int lastRawX;
    private int lastRawY;
    private RelativeLayout sample;
    private int y;
    private TextView tv_jiedan, tv_xiuxi;

    public MineFragment(Activity context) {
        super(context);
    }

    ImageLoader imageLoader = ImageLoader.getInstance();
    DisplayImageOptions options = ImageLoaderUtil.getOptions();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_mine, container, false);
        initView(view);
        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        initAdmin();
        if (storeBean.getAvatar() == null) {
            imageLoader.displayImage(Const.USER_DEFAULT_ICON, myicon, options);
        } else {
            imageLoader.displayImage(storeBean.getAvatar(), myicon,
                    options);

        }
    }

    @Override
    public void onResponse(String response, String url) {
        dismissLoading();
        try {
            JSONObject json = new JSONObject(response);
            int stauts = json.optInt("status");
            String msg = json.optString("msg");
            if (stauts == 0) {
                mSavePreferencesData.putStringData("token", "");
                mSavePreferencesData.putStringData("json", "");
                Tools.jump(mcontext, LoginActivity.class, true);
            } else {
                Tools.showToast(mcontext, msg);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            Tools.showToast(mcontext, "发生错误,请重试!");
        }
    }

    private void initView(View view) {
        tv_price = (TextView) view.findViewById(R.id.tv_price);
        tv_number = (TextView) view.findViewById(R.id.tv_number);
        tv_signature = (TextView) view.findViewById(R.id.tv_signature);
        myicon = (CircleImageView) view.findViewById(R.id.myicon);
        tv_name = (TextView) view.findViewById(R.id.tv_name);
        iv_magess = (ImageView) view.findViewById(R.id.iv_magess);
        iv_set = (ImageView) view.findViewById(R.id.iv_set);
        rl_data = (RelativeLayout) view.findViewById(R.id.rl_data);
        iv_img = (ImageView) view.findViewById(R.id.iv_img);
        sample = (RelativeLayout) view.findViewById(R.id.sample);
        tv_jiedan = (TextView) view.findViewById(R.id.tv_jiedan);
        tv_xiuxi = (TextView) view.findViewById(R.id.tv_xiuxi);
        tv_name.setText(storeBean.getName());
//        ll_exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                deleteOrderDialog();
//
//            }
//        });
        rl_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.jump(mcontext, PersonalActivity.class, false);
            }
        });
        iv_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.jump(mcontext, SetActivity.class, false);
            }
        });

        iv_img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int rawX = (int) event.getRawX();
                int rawY = (int) event.getRawY();
                ViewGroup.LayoutParams layoutParams = iv_img.getLayoutParams();
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        lastRawY = rawY;
                        break;
                    case MotionEvent.ACTION_MOVE:
                        int offY = rawY - lastRawY;
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += offY;
                        y = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (y < 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;

                        }
                        if (y > iv_img.getHeight()) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iv_img.getHeight();
                        }
                        iv_img.setLayoutParams(layoutParams);
                        lastRawY = rawY;
                        break;
                    case MotionEvent.ACTION_UP:
                        if (y < iv_img.getHeight()/2) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                            jiedan();
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = iv_img.getHeight();
                            xiuxi();
                        }
                        iv_img.setLayoutParams(layoutParams);
                        lastRawY = rawY;
                        break;
                }
                return true;
            }
        });
    }

    private void jiedan() {
        tv_jiedan.setTextColor(mcontext.getResources().getColor(R.color.white));
        tv_xiuxi.setTextColor(mcontext.getResources().getColor(R.color.FMT_ECC6B0));

    }

    private void xiuxi() {
        tv_jiedan.setTextColor(mcontext.getResources().getColor(R.color.FMT_ECC6B0));
        tv_xiuxi.setTextColor(mcontext.getResources().getColor(R.color.white));
    }
}
