// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SellDetailActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.SellDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755199, "field 'recycleView'");
    target.recycleView = finder.castView(view, 2131755199, "field 'recycleView'");
    view = finder.findRequiredView(source, 2131755230, "field 'springView'");
    target.springView = finder.castView(view, 2131755230, "field 'springView'");
    view = finder.findRequiredView(source, 2131755249, "field 'llListContent'");
    target.llListContent = finder.castView(view, 2131755249, "field 'llListContent'");
    view = finder.findRequiredView(source, 2131755139, "field 'llListNone'");
    target.llListNone = finder.castView(view, 2131755139, "field 'llListNone'");
    view = finder.findRequiredView(source, 2131755202, "field 'imgBack'");
    target.imgBack = finder.castView(view, 2131755202, "field 'imgBack'");
    view = finder.findRequiredView(source, 2131755216, "field 'tv_star_timer'");
    target.tv_star_timer = finder.castView(view, 2131755216, "field 'tv_star_timer'");
    view = finder.findRequiredView(source, 2131755217, "field 'tv_end_timer'");
    target.tv_end_timer = finder.castView(view, 2131755217, "field 'tv_end_timer'");
    view = finder.findRequiredView(source, 2131755279, "field 'tv_ok'");
    target.tv_ok = finder.castView(view, 2131755279, "field 'tv_ok'");
  }

  @Override public void unbind(T target) {
    target.recycleView = null;
    target.springView = null;
    target.llListContent = null;
    target.llListNone = null;
    target.imgBack = null;
    target.tv_star_timer = null;
    target.tv_end_timer = null;
    target.tv_ok = null;
  }
}
