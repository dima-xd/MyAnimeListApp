package com.myanimelist.app.ui.anime;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.myanimelist.app.BuildConfig;
import com.myanimelist.app.beans.Anime;
import com.myanimelist.app.beans.AnimeRanking;
import com.myanimelist.app.constants.RankingTypes;
import com.myanimelist.app.controllers.ControllerAnime;

public class AnimeViewModel extends AndroidViewModel {

    private final String mal_token;
    private final ControllerAnime controller;

    public AnimeViewModel(@NonNull Application application) {
        super(application);
        mal_token = BuildConfig.MAL_TOKEN;
        controller = new ControllerAnime(mal_token);
    }

    public Anime getAnimeByID(String id) {
        return controller.getAnimeByID(id);
    }

    public AnimeRanking getAnimeRanking(String limit, String offset) {
        return controller.getAnimeRanking(RankingTypes.BYPOPULARITY.getType(), limit, offset);
    }
}