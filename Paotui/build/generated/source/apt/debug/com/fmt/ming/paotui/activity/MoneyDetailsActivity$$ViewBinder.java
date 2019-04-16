// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MoneyDetailsActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.MoneyDetailsActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755247, "field 'tvMoney'");
    target.tvMoney = finder.castView(view, 2131755247, "field 'tvMoney'");
    view = finder.findRequiredView(source, 2131755253, "field 'tv_staus'");
    target.tv_staus = finder.castView(view, 2131755253, "field 'tv_staus'");
    view = finder.findRequiredView(source, 2131755254, "field 'tvWay'");
    target.tvWay = finder.castView(view, 2131755254, "field 'tvWay'");
    view = finder.findRequiredView(source, 2131755255, "field 'tvCard'");
    target.tvCard = finder.castView(view, 2131755255, "field 'tvCard'");
    view = finder.findRequiredView(source, 2131755256, "field 'tvTimer'");
    target.tvTimer = finder.castView(view, 2131755256, "field 'tvTimer'");
    view = finder.findRequiredView(source, 2131755227, "field 'tvNumber'");
    target.tvNumber = finder.castView(view, 2131755227, "field 'tvNumber'");
    view = finder.findRequiredView(source, 2131755257, "field 'tvNote'");
    target.tvNote = finder.castView(view, 2131755257, "field 'tvNote'");
  }

  @Override public void unbind(T target) {
    target.tvMoney = null;
    target.tv_staus = null;
    target.tvWay = null;
    target.tvCard = null;
    target.tvTimer = null;
    target.tvNumber = null;
    target.tvNote = null;
  }
}
