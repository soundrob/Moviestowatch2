package com.fasttrackit.moviestowatch.presentation.view.fragment;

import android.app.FragmentManager;
import com.fasttrackit.moviestowatch.R;

/**
 * @author mihai.mecea
 */

public class FragmentNavigator {

  private static final int CONTAINER_ID = R.id.content_drawer;

  private FragmentManager fragmentManager;

  public FragmentNavigator(FragmentManager fragmentManager) {
    this.fragmentManager = fragmentManager;
  }


}
