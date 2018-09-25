package com.fmt.ming.paotui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fmt.ming.paotui.R;
import com.fmt.ming.paotui.activity.ChangePasswordActivity;
import com.fmt.ming.paotui.activity.LoginActivity;
import com.fmt.ming.paotui.activity.MobilePhoneActivity;
import com.fmt.ming.paotui.activity.MoneyActivity;
import com.fmt.ming.paotui.activity.PersonalActivity;
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

    private LinearLayout ll_data;
    private LinearLayout ll_password;
    private LinearLayout ll_exit;
    private CircleImageView myicon;
    private TextView tv_name;

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




    public void mlogout() {
        Map<String, String> map = new HashMap<>();
        map.put("token", mSavePreferencesData.getStringData("token"));
        map.put("israpp", "1");
        mQueue.add(ParamTools.packParam(Const.mlogout, this, this, map));
        loading();
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
        ll_password = (LinearLayout) view.findViewById(R.id.ll_password);
        ll_data = (LinearLayout) view.findViewById(R.id.ll_data);
        ll_exit = (LinearLayout) view.findViewById(R.id.ll_exit);
        myicon = (CircleImageView) view.findViewById(R.id.myicon);
        tv_name = (TextView) view.findViewById(R.id.tv_name);
        tv_name.setText(storeBean.getName());
        ll_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteOrderDialog();

            }
        });
        ll_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.jump(mcontext, PersonalActivity.class, false);
            }
        });
        ll_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.jump(mcontext, ChangePasswordActivity.class, false);
            }
        });
    }

    private void deleteOrderDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mcontext);
        builder.setMessage("您确定要退出登录?");
        builder.setTitle("提示");
        builder.setPositiveButton("取消", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setNegativeButton("确定", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                mlogout();

            }
        });
        builder.create().show();
    }
}
