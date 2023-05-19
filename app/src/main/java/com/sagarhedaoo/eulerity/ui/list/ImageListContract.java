package com.sagarhedaoo.eulerity.ui.list;

import com.sagarhedaoo.eulerity.data.model.Image;
import com.sagarhedaoo.eulerity.ui.base.BasePresenter;
import com.sagarhedaoo.eulerity.ui.base.BaseView;

import java.util.List;

public interface ImageListContract {

    interface Presenter extends BasePresenter<View> {

        /* Pulls list of images from repository  */
        void getImages();

        /* Makes a fresh network call for new images */
        void loadNewImages();
    }

    interface View extends BaseView<Presenter> {

        /* Takes a given list and sets it to the ImageListAdapter */
        void setList(List<Image> imageList);

        /* Displays toasts when unable to retrieve new images from network */
        void showNetworkIssue();

        /* displays progress bar when requests for image is in progress */
        void showLoadingBar();

        /* Hides progress bar when request ends */
        void hideLoadingBar();
    }
}

