package com.myanimelist.app.controllers;

import com.myanimelist.app.api_ifaces.MalApi;
import com.myanimelist.app.beans.Anime;
import com.myanimelist.app.beans.AnimeRanking;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.myanimelist.app.constants.Constants.API.*;

public class ControllerAnime {

    private MalApi api;

    public ControllerAnime(String token) {
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

    public Anime getAnimeByID(String id) {
        return api.getAnimeById(id, FIELDS_ANIME).blockingSingle();
    }

    public AnimeRanking getAnimeRanking(String rankingType, String limit, String offset) {
        return api.getAnimeRanking(rankingType, limit, offset, FIELDS_ANIME).blockingSingle();
    }

}
