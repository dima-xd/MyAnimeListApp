package com.myanimelist.app.ui.manga;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.myanimelist.app.R;
import com.myanimelist.app.beans.DataManga;
import com.myanimelist.app.beans.Manga;
import com.squareup.picasso.Picasso;

public class MangaInfo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manga_layout);

        Gson gson = new Gson();
        String json = getIntent().getStringExtra("manga");
        DataManga dataManga = gson.fromJson(json, DataManga.class);

        initManga(dataManga);
    }

    private void initManga(DataManga dataManga) {
        Manga manga = dataManga.getNode();
        ImageView image = findViewById(R.id.manga_image);
        TextView title = findViewById(R.id.manga_title);
        TextView titleJp = findViewById(R.id.manga_title_jp);
        TextView description = findViewById(R.id.manga_description);

        Picasso.get().load(manga.getMainPicture().getLarge()).into(image);
        image.setContentDescription(manga.getTitle());
        title.setText(manga.getTitle());
        titleJp.setText(manga.getAlternativeTitles().getJa());
        description.setText(manga.getSynopsis());
    }
}
