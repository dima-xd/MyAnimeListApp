package com.myanimelist.app.controllers;

import static com.myanimelist.app.constants.Constants.API.FIELDS_MANGA;
import static com.myanimelist.app.constants.Constants.API.MAL_BASE_URL;

import com.myanimelist.app.api_ifaces.MalApi;
import com.myanimelist.app.beans.Manga;
import com.myanimelist.app.beans.MangaRanking;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ControllerManga {

    private MalApi api;

    public ControllerManga(String token) {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(chain -> {
            Request request = chain.request().newBuilder().addHeader("X-MAL-CLIENT-ID", token).build();
            return chain.proceed(request);
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MAL_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .client(httpClient.build())
                .build();

        api = retrofit.create(MalApi.class);
    }

    public Manga getMangaByID(String id) {
        return api.getMangaById(id, FIELDS_MANGA).blockingSingle();
    }

    public MangaRanking getMangaRanking(String rankingType, String limit, String offset) {
        return api.getMangaRanking(rankingType, limit, offset, FIELDS_MANGA).blockingSingle();
    }
}
