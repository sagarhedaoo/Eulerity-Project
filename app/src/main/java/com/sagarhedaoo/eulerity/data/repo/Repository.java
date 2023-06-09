package com.sagarhedaoo.eulerity.data.repo;

import com.sagarhedaoo.eulerity.data.model.Image;
import com.sagarhedaoo.eulerity.data.model.Upload;

import java.util.List;

import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public interface Repository {

    /* Pulls a list of images from the repository */
    Single<List<Image>> getImageList();

    /* Makes a fresh network call for new images  */
    Single<List<Image>> getFreshImages();

    /* Gets a upload URL to for uploading an image */
    Single<Upload> getUploadUrl();

    /* Uploads original image URL and new image to server */
    Single<Boolean> uploadImage(String uploadUrl, RequestBody originalUrl, MultipartBody.Part file);
}
