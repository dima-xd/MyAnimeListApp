package com.myanimelist.app.ui.anime;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.myanimelist.app.R;
import com.myanimelist.app.beans.Anime;
import com.myanimelist.app.beans.Data;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class AnimeInfo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anime_layout);

        Gson gson = new Gson();
        String json = getIntent().getStringExtra("anime");
        Data data = gson.fromJson(json, Data.class);

        initAnime(data);
    }

    private void initAnime(Data data) {
        Anime anime = data.getNode();
        ImageView image = findViewById(R.id.anime_image);
        TextView title = findViewById(R.id.anime_title);
        TextView titleJp = findViewById(R.id.anime_title_jp);
        TextView description = findViewById(R.id.anime_description);

        Picasso.get().load(anime.getMainPicture().getLarge()).into(image);
        image.setContentDescription(anime.getTitle());
        title.setText(anime.getTitle());
        titleJp.setText(anime.getAlternativeTitles().getJa());
        description.setText(anime.getSynopsis());
    }

}
