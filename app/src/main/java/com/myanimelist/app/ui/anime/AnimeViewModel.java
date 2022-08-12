package com.myanimelist.app.ui.anime;

import android.app.Application;
import android.content.pm.PackageManager;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import static com.myanimelist.app.constants.Constants.*;

import com.myanimelist.app.BuildConfig;
import com.myanimelist.app.beans.AnimeRanking;
import com.myanimelist.app.constants.RankingTypes;
import com.myanimelist.app.controllers.ControllerAnime;

public class AnimeViewModel extends AndroidViewModel {

    private final String mal_token;

    public AnimeViewModel(@NonNull Application application) {
        super(application);
        mal_token = BuildConfig.MAL_TOKEN;
    }

    public AnimeRanking getAnimeRanking(String limit, String offset) {
        ControllerAnime controller = new ControllerAnime(mal_token);
        return controller.getAnimeRanking(RankingTypes.BYPOPULARITY.getType(), limit, offset);
    }
}