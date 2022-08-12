package com.myanimelist.app.ui.manga;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.myanimelist.app.BuildConfig;
import com.myanimelist.app.beans.MangaRanking;
import com.myanimelist.app.constants.RankingTypes;
import com.myanimelist.app.controllers.ControllerManga;

public class MangaViewModel extends AndroidViewModel {

    private final String mal_token;

    public MangaViewModel(@NonNull Application application) {
        super(application);
        mal_token = BuildConfig.MAL_TOKEN;
    }

    public MangaRanking getMangaRanking(String limit, String offset) {
        ControllerManga controller = new ControllerManga(mal_token);
        return controller.getMangaRanking(RankingTypes.BYPOPULARITY.getType(), limit, offset);
    }
}