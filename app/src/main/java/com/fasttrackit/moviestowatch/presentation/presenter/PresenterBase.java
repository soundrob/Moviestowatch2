package com.fasttrackit.moviestowatch.presentation.presenter;

import com.fasttrackit.moviestowatch.presentation.view.proxy.BaseProxyView;

/**
 * @author mihai.mecea
 */

public interface PresenterBase<TYPE extends BaseProxyView> {

  void onViewCreated(TYPE proxyView);

  void onViewDestroyed();

  void onPause();

}
