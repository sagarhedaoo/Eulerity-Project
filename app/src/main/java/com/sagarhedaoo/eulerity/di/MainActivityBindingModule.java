package com.sagarhedaoo.eulerity.di;

import com.sagarhedaoo.eulerity.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityBindingModule {

    @ContributesAndroidInjector(modules = FragmentsBindingModule.class)
    public abstract MainActivity contributesMainActivity();

}
