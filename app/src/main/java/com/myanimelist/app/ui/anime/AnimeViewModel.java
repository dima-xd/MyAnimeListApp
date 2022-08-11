package com.myanimelist.app.ui.anime;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import static com.myanimelist.app.constants.Constants.*;

import com.myanimelist.app.beans.Anime;
import com.myanimelist.app.beans.AnimeRanking;
import com.myanimelist.app.constants.RankingTypes;
import com.myanimelist.app.controllers.ControllerAnime;

import java.util.List;

public class AnimeViewModel extends AndroidViewModel {

    private String mal_token;

    public AnimeViewModel(@NonNull Application application) {
        super(application);
        try {
            mal_token = getApplication()
                    .getApplicationContext()
                    .getPackageManager()
                    .getApplicationInfo(getApplication().getApplicationContext().getPackageName(), PackageManager.GET_META_DATA)
                    .metaData.get(MAL_TOKEN_META_DATA).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public AnimeRanking getAnimeRanking(String limit, String offset) {
        ControllerAnime controller = new ControllerAnime(mal_token);
        return controller.getAnimeRanking(RankingTypes.BYPOPULARITY.getType(), limit, offset);
    }
}