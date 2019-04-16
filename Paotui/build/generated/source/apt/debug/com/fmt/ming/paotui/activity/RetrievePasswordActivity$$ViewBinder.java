// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RetrievePasswordActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.RetrievePasswordActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755200, "field 'imgBack'");
    target.imgBack = finder.castView(view, 2131755200, "field 'imgBack'");
    view = finder.findRequiredView(source, 2131755199, "field 'llViewBack'");
    target.llViewBack = finder.castView(view, 2131755199, "field 'llViewBack'");
    view = finder.findRequiredView(source, 2131755201, "field 'rightViewText'");
    target.rightViewText = finder.castView(view, 2131755201, "field 'rightViewText'");
    view = finder.findRequiredView(source, 2131755202, "field 'topViewText'");
    target.topViewText = finder.castView(view, 2131755202, "field 'topViewText'");
    view = finder.findRequiredView(source, 2131755279, "field 'etIphone'");
    target.etIphone = finder.castView(view, 2131755279, "field 'etIphone'");
    view = finder.findRequiredView(source, 2131755151, "field 'etCode'");
    target.etCode = finder.castView(view, 2131755151, "field 'etCode'");
    view = finder.findRequiredView(source, 2131755152, "field 'tvCode'");
    target.tvCode = finder.castView(view, 2131755152, "field 'tvCode'");
    view = finder.findRequiredView(source, 2131755207, "field 'etNew'");
    target.etNew = finder.castView(view, 2131755207, "field 'etNew'");
    view = finder.findRequiredView(source, 2131755280, "field 'etNew2'");
    target.etNew2 = finder.castView(view, 2131755280, "field 'etNew2'");
    view = finder.findRequiredView(source, 2131755153, "field 'btnNext'");
    target.btnNext = finder.castView(view, 2131755153, "field 'btnNext'");
  }

  @Override public void unbind(T target) {
    target.imgBack = null;
    target.llViewBack = null;
    target.rightViewText = null;
    target.topViewText = null;
    target.etIphone = null;
    target.etCode = null;
    target.tvCode = null;
    target.etNew = null;
    target.etNew2 = null;
    target.btnNext = null;
  }
}
