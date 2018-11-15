// Generated code from Butter Knife. Do not modify!
package com.fmt.ming.paotui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TakeActivity$$ViewBinder<T extends com.fmt.ming.paotui.activity.TakeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131755292, "field 'etText'");
    target.etText = finder.castView(view, 2131755292, "field 'etText'");
    view = finder.findRequiredView(source, 2131755294, "field 'topicPhotoGroup'");
    target.topicPhotoGroup = finder.castView(view, 2131755294, "field 'topicPhotoGroup'");
    view = finder.findRequiredView(source, 2131755295, "field 'tvAdds'");
    target.tvAdds = finder.castView(view, 2131755295, "field 'tvAdds'");
    view = finder.findRequiredView(source, 2131755155, "field 'btnNext'");
    target.btnNext = finder.castView(view, 2131755155, "field 'btnNext'");
    view = finder.findRequiredView(source, 2131755293, "field 'tvText'");
    target.tvText = finder.castView(view, 2131755293, "field 'tvText'");
    view = finder.findRequiredView(source, 2131755296, "field 'rbQishou'");
    target.rbQishou = finder.castView(view, 2131755296, "field 'rbQishou'");
    view = finder.findRequiredView(source, 2131755297, "field 'rbXianshang'");
    target.rbXianshang = finder.castView(view, 2131755297, "field 'rbXianshang'");
    view = finder.findRequiredView(source, 2131755298, "field 'rbYue'");
    target.rbYue = finder.castView(view, 2131755298, "field 'rbYue'");
    view = finder.findRequiredView(source, 2131755259, "field 'tv_information'");
    target.tv_information = finder.castView(view, 2131755259, "field 'tv_information'");
  }

  @Override public void unbind(T target) {
    target.etText = null;
    target.topicPhotoGroup = null;
    target.tvAdds = null;
    target.btnNext = null;
    target.tvText = null;
    target.rbQishou = null;
    target.rbXianshang = null;
    target.rbYue = null;
    target.tv_information = null;
  }
}
