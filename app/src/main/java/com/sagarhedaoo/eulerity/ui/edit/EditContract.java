package com.sagarhedaoo.eulerity.ui.edit;

import com.sagarhedaoo.eulerity.ui.base.BasePresenter;
import com.sagarhedaoo.eulerity.ui.base.BaseView;

public interface EditContract {

    interface Presenter extends BasePresenter<View> {

        /* Retrieves the link for uploading an image */
        void getUploadLink();

        /* Uploads the image to the server */
        void uploadImage(String originalUrl, String root);
    }

    interface View extends BaseView<Presenter> {

        /* Notifies the user the upload has been complete*/
        void uploadComplete();
    }
}