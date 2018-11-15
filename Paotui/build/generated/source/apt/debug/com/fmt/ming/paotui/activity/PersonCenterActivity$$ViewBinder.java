// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PersonCenterActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.PersonCenterActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755202, "field 'imgBack' and method 'onViewClicked'");
    target.imgBack = finder.castView(view, 2131755202, "field 'imgBack'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
    view = finder.findRequiredView(source, 2131755223, "field 'tvVersion'");
    target.tvVersion = finder.castView(view, 2131755223, "field 'tvVersion'");
    view = finder.findRequiredView(source, 2131755270, "field 'tvQuit' and method 'onViewClicked'");
    target.tvQuit = finder.castView(view, 2131755270, "field 'tvQuit'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onViewClicked(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.imgBack = null;
    target.tvVersion = null;
    target.tvQuit = null;
  }
}
