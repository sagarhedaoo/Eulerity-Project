package com.sagarhedaoo.eulerity.di;

import com.sagarhedaoo.eulerity.ui.edit.EditContract;
import com.sagarhedaoo.eulerity.ui.edit.EditFragment;
import com.sagarhedaoo.eulerity.ui.edit.EditPresenter;
import com.sagarhedaoo.eulerity.ui.list.ImageListContract;
import com.sagarhedaoo.eulerity.ui.list.ImageListFragment;
import com.sagarhedaoo.eulerity.ui.list.ImageListPresenter;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentsBindingModule {

    @ContributesAndroidInjector
    public abstract ImageListFragment contributesImageListFragment();

    @Binds
    public abstract ImageListContract.Presenter imageListPresenter(ImageListPresenter imageListPresenter);

    @ContributesAndroidInjector
    public abstract EditFragment contributesEditFragment();

    @Binds
    public abstract EditContract.Presenter editPresenter(EditPresenter editPresenter);
}
