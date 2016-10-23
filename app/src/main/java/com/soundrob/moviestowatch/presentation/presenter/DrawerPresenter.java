package com.soundrob.moviestowatch.presentation.presenter;

import com.soundrob.moviestowatch.R;
import com.soundrob.moviestowatch.presentation.view.fragment.NavigationHelper;
import com.soundrob.moviestowatch.presentation.view.proxy.DrawerProxyView;

/**
 * Created by Mihai on 12/10/2016.
 */

public class DrawerPresenter implements PresenterBase<DrawerProxyView> {


    private NavigationHelper navigationHelper;

    private DrawerPresenter(NavigationHelper navigationHelper){
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

        switch (id){

            case R.id.nav_box_office:
                navigationHelper.onNavigateToBoxOffice();

            case R.id.nav_watch_list:
                navigationHelper.onNavigateToWatchList();

    break;
    }
}

