package com.fasttrackit.moviestowatch.presentation.view.fragment;

import com.fasttrackit.moviestowatch.presentation.view.listener.OnNavigateToScreenListener;

/**
 * @author mihai.mecea
 */

public class NavigationHelper implements OnNavigateToScreenListener{

  private FragmentNavigator fragmentNavigator;

  public NavigationHelper(FragmentNavigator fragmentNavigator) {
    this.fragmentNavigator = fragmentNavigator;
  }

  @Override
  public void onNavigateToBoxOffice() {

  }

  @Override
  public void onNavigateToWatchList() {

  }

}
