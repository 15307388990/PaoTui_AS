// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MoneyActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.MoneyActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755204, "field 'topViewText'");
    target.topViewText = finder.castView(view, 2131755204, "field 'topViewText'");
    view = finder.findRequiredView(source, 2131755211, "field 'rlTitleBar'");
    target.rlTitleBar = finder.castView(view, 2131755211, "field 'rlTitleBar'");
    view = finder.findRequiredView(source, 2131755244, "field 'tvMoney'");
    target.tvMoney = finder.castView(view, 2131755244, "field 'tvMoney'");
    view = finder.findRequiredView(source, 2131755199, "field 'recycleView'");
    target.recycleView = finder.castView(view, 2131755199, "field 'recycleView'");
    view = finder.findRequiredView(source, 2131755230, "field 'springView'");
    target.springView = finder.castView(view, 2131755230, "field 'springView'");
    view = finder.findRequiredView(source, 2131755249, "field 'llListContent'");
    target.llListContent = finder.castView(view, 2131755249, "field 'llListContent'");
    view = finder.findRequiredView(source, 2131755139, "field 'llListNone'");
    target.llListNone = finder.castView(view, 2131755139, "field 'llListNone'");
    view = finder.findRequiredView(source, 2131755247, "field 'll_freeze'");
    target.ll_freeze = finder.castView(view, 2131755247, "field 'll_freeze'");
  }

  @Override public void unbind(T target) {
    target.topViewText = null;
    target.rlTitleBar = null;
    target.tvMoney = null;
    target.recycleView = null;
    target.springView = null;
    target.llListContent = null;
    target.llListNone = null;
    target.ll_freeze = null;
  }
}
