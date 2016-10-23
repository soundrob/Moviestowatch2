package com.fasttrackit.moviestowatch.presentation.presenter;

import com.fasttrackit.moviestowatch.R;
import com.fasttrackit.moviestowatch.presentation.view.fragment.NavigationHelper;
import com.fasttrackit.moviestowatch.presentation.view.proxy.DrawerProxyView;

/**
 * @author mihai.mecea
 */

public class DrawerPresenter implements PresenterBase<DrawerProxyView> {

  private DrawerProxyView view;
  private NavigationHelper navigationHelper;

  public DrawerPresenter(NavigationHelper navigationHelper) {
    this.navigationHelper = navigationHelper;
  }

  @Override
  public void onViewCreated(DrawerProxyView proxyView) {
    this.view = proxyView;

    this.view.initViews();
  }

  @Override
  public void onViewDestroyed() {

  }

  @Override
  public void onPause() {

  }

  public void onMenuItemSelected(int id) {
    switch (id) {
      case R.id.nav_box_office:
        navigationHelper.onNavigateToBoxOffice();
        break;
      case R.id.nav_watch_list:
        navigationHelper.onNavigateToWatchList();
        break;

    }
  }

}
