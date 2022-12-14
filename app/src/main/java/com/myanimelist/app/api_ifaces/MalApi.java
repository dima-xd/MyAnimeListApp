package com.myanimelist.app.api_ifaces;

import com.myanimelist.app.beans.Anime;
import com.myanimelist.app.beans.AnimeRanking;
import com.myanimelist.app.beans.Manga;
import com.myanimelist.app.beans.MangaRanking;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MalApi {

    @GET("anime/{id}")
    Observable<Anime> getAnimeById(
            @Path("id") String id,
            @Query("fields") String fields
    );

    @GET("anime/ranking")
    Observable<AnimeRanking> getAnimeRanking(
            @Query("ranking_type") String type,
            @Query("limit") String limit,
            @Query("offset") String offset,
            @Query("fields") String fields
    );

    @GET("manga/{id}")
    Observable<Manga> getMangaById(
            @Path("id") String id,
            @Query("fields") String fields
    );

    @GET("manga/ranking")
    Observable<MangaRanking> getMangaRanking(
            @Query("ranking_type") String type,
            @Query("limit") String limit,
            @Query("offset") String offset,
            @Query("fields") String fields
    );
}
