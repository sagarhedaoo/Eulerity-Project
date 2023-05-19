package com.sagarhedaoo.eulerity.data.remote;

import com.sagarhedaoo.eulerity.data.model.Image;
import com.sagarhedaoo.eulerity.data.model.Upload;


import java.util.List;

import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface ImageService {
    @GET("image")
    Single<List<Image>> getImageList();

    @GET("upload")
    Single<Upload> getUploadImageUrl();

    @Multipart
    @POST("{uploadLink}")
    Single<Boolean> uploadImage(@Path(value = "uploadLink", encoded = true) String url,
                                @Part("appid") RequestBody appid,
                                @Part("original") RequestBody originalUrl,
                                @Part MultipartBody.Part file);
}