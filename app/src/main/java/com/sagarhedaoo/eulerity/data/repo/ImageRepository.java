package com.sagarhedaoo.eulerity.data.repo;

import com.sagarhedaoo.eulerity.data.model.Image;
import com.sagarhedaoo.eulerity.data.model.Upload;
import com.sagarhedaoo.eulerity.data.remote.ImageService;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

@Singleton
public class ImageRepository implements Repository {
    private static final String APPID = "shedaoo@stevens.edu";
    private final ImageService imageService;
    private List<Image> imageList;

    @Inject
    public ImageRepository(ImageService imageService) {
        this.imageService = imageService;
        imageList = new ArrayList<>();
    }

    @Override
    public Single<List<Image>> getFreshImages() {
        imageList.clear();
        return imageService.getImageList()
                .map(images -> {
                    imageList.addAll(images);
                    return imageList;
                });
    }

    @Override
    public Single<Upload> getUploadUrl() {
        return imageService.getUploadImageUrl();
    }

    @Override
    public Single<Boolean> uploadImage(String uploadUrl, RequestBody originalUrl, MultipartBody.Part file) {
        RequestBody appidBody = RequestBody.create(MediaType.parse("multipart/form-data"), APPID);
        return imageService.uploadImage(uploadUrl, appidBody, originalUrl, file);
    }

    @Override
    public Single<List<Image>> getImageList() {
        if (imageList.isEmpty()) {
            return getFreshImages();
        } else {
            return Single.just(imageList);
        }
    }
}