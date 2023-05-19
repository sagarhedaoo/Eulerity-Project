package com.sagarhedaoo.eulerity.util;


import android.support.v4.app.FragmentManager;

import com.sagarhedaoo.eulerity.R;
import com.sagarhedaoo.eulerity.ui.MainActivity;
import com.sagarhedaoo.eulerity.ui.edit.EditFragment;
import com.sagarhedaoo.eulerity.ui.list.ImageListFragment;

import javax.inject.Inject;

public class NavigationController {
    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationController(MainActivity mainActivity) {
        this.containerId = R.id.fragments_container;
        this.fragmentManager = mainActivity.getSupportFragmentManager();
    }

    /* Opens up ImageListFragment */
    public void openListFragment() {
        ImageListFragment imageListFragment = new ImageListFragment();
        fragmentManager.beginTransaction()
                .replace(containerId, imageListFragment)
                .commitAllowingStateLoss();
    }

    /* Opens up EditFragment */
    public void openEditFragment(String imageUrl) {
        EditFragment editFragment = EditFragment.create(imageUrl);
        fragmentManager.beginTransaction()
                .replace(containerId, editFragment)
                .addToBackStack(null)
                .commitAllowingStateLoss();
    }
}
