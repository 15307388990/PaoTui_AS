// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ChangePasswordActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.ChangePasswordActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131755205, "field 'etOld'");
    target.etOld = finder.castView(view, 2131755205, "field 'etOld'");
    view = finder.findRequiredView(source, 2131755206, "field 'cbOld'");
    target.cbOld = finder.castView(view, 2131755206, "field 'cbOld'");
    view = finder.findRequiredView(source, 2131755207, "field 'etOld2'");
    target.etOld2 = finder.castView(view, 2131755207, "field 'etOld2'");
    view = finder.findRequiredView(source, 2131755208, "field 'cbOld2'");
    target.cbOld2 = finder.castView(view, 2131755208, "field 'cbOld2'");
    view = finder.findRequiredView(source, 2131755209, "field 'etNew'");
    target.etNew = finder.castView(view, 2131755209, "field 'etNew'");
    view = finder.findRequiredView(source, 2131755210, "field 'cbNew'");
    target.cbNew = finder.castView(view, 2131755210, "field 'cbNew'");
    view = finder.findRequiredView(source, 2131755155, "field 'btnNext'");
    target.btnNext = finder.castView(view, 2131755155, "field 'btnNext'");
  }

  @Override public void unbind(T target) {
    target.imgBack = null;
    target.llViewBack = null;
    target.rightViewText = null;
    target.topViewText = null;
    target.etOld = null;
    target.cbOld = null;
    target.etOld2 = null;
    target.cbOld2 = null;
    target.etNew = null;
    target.cbNew = null;
    target.btnNext = null;
  }
}
