package com.sagarhedaoo.eulerity.ui.base;


public interface BasePresenter<T> {

    /* Connects the Presenter to the View */
    void attach(T view);

    /* Disconnects the Presenter from the View */
    void detach();

    /* Clears out any disposables */
    void clearDisposables();
}
