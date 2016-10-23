package com.soundrob.moviestowatch.presentation.presenter;

import com.soundrob.moviestowatch.presentation.view.proxy.BaseProxyView;
import com.soundrob.moviestowatch.presentation.view.proxy.DrawerProxyView;

/**
 * Created by Mihai on 12/10/2016.
 */

public interface PresenterBase<TYPE extends BaseProxyView> {

    private DrawerProxyView view;


    void onViewCreated(TYPE proxyView){
        this.view

    }

    void onViewDestroyed();

    void onPause();

}
