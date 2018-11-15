// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RetrievePasswordActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.RetrievePasswordActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755202, "field 'imgBack'");
    target.imgBack = finder.castView(view, 2131755202, "field 'imgBack'");
    view = finder.findRequiredView(source, 2131755201, "field 'llViewBack'");
    target.llViewBack = finder.castView(view, 2131755201, "field 'llViewBack'");
    view = finder.findRequiredView(source, 2131755203, "field 'rightViewText'");
    target.rightViewText = finder.castView(view, 2131755203, "field 'rightViewText'");
    view = finder.findRequiredView(source, 2131755204, "field 'topViewText'");
    target.topViewText = finder.castView(view, 2131755204, "field 'topViewText'");
    view = finder.findRequiredView(source, 2131755277, "field 'etIphone'");
    target.etIphone = finder.castView(view, 2131755277, "field 'etIphone'");
    view = finder.findRequiredView(source, 2131755153, "field 'etCode'");
    target.etCode = finder.castView(view, 2131755153, "field 'etCode'");
    view = finder.findRequiredView(source, 2131755154, "field 'tvCode'");
    target.tvCode = finder.castView(view, 2131755154, "field 'tvCode'");
    view = finder.findRequiredView(source, 2131755209, "field 'etNew'");
    target.etNew = finder.castView(view, 2131755209, "field 'etNew'");
    view = finder.findRequiredView(source, 2131755278, "field 'etNew2'");
    target.etNew2 = finder.castView(view, 2131755278, "field 'etNew2'");
    view = finder.findRequiredView(source, 2131755155, "field 'btnNext'");
    target.btnNext = finder.castView(view, 2131755155, "field 'btnNext'");
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
