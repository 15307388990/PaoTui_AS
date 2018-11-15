// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LoginActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.LoginActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755219, "field 'etLoginAccount'");
    target.etLoginAccount = finder.castView(view, 2131755219, "field 'etLoginAccount'");
    view = finder.findRequiredView(source, 2131755221, "field 'etLoginPassword'");
    target.etLoginPassword = finder.castView(view, 2131755221, "field 'etLoginPassword'");
    view = finder.findRequiredView(source, 2131755222, "field 'login' and method 'onViewClicked'");
    target.login = finder.castView(view, 2131755222, "field 'login'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131755223, "field 'tv_version'");
    target.tv_version = finder.castView(view, 2131755223, "field 'tv_version'");
    view = finder.findRequiredView(source, 2131755224, "field 'tv_forgot'");
    target.tv_forgot = finder.castView(view, 2131755224, "field 'tv_forgot'");
  }

  @Override public void unbind(T target) {
    target.etLoginAccount = null;
    target.etLoginPassword = null;
    target.login = null;
    target.tv_version = null;
    target.tv_forgot = null;
  }
}
