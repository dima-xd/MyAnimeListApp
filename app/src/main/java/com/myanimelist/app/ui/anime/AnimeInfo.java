package com.myanimelist.app.ui.anime;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.myanimelist.app.R;
import com.myanimelist.app.beans.Anime;
import com.myanimelist.app.utils.DateUtils;
import com.squareup.picasso.Picasso;

import java.text.ParseException;

import static com.myanimelist.app.constants.Constants.*;

public class AnimeInfo extends AppCompatActivity {

    private AnimeViewModel animeViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.anime_layout);

            animeViewModel = new ViewModelProvider(this).get(AnimeViewModel.class);

            String id = getIntent().getStringExtra(ANIME_ID);

            initAnime(id);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @SuppressLint("SetTextI18n")
    private void initAnime(String id) throws ParseException {
        Anime anime = animeViewModel.getAnimeByID(id);
        ImageView image = findViewById(R.id.anime_image);
        TextView title = findViewById(R.id.anime_title);
        TextView titleJp = findViewById(R.id.anime_title_jp);
        TextView type = findViewById(R.id.anime_type);
        TextView year = findViewById(R.id.anime_year);
        TextView description = findViewById(R.id.anime_description);

        Picasso.get().load(anime.getMainPicture().getLarge()).into(image);
        image.setContentDescription(anime.getTitle());
        title.setText(anime.getTitle());
        titleJp.setText(anime.getAlternativeTitles().getJa());
        type.setText(anime.getMediaType().toUpperCase() + ",");
        year.setText(DateUtils.initDate(anime.getStartDate()) + " - " + DateUtils.initDate(anime.getEndDate()));
        description.setText(anime.getSynopsis());
    }

}
