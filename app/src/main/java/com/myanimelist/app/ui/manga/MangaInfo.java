package com.myanimelist.app.ui.manga;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.myanimelist.app.R;
import com.myanimelist.app.beans.Manga;
import com.myanimelist.app.utils.DateUtils;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.util.stream.Collectors;

import static com.myanimelist.app.constants.Constants.*;

public class MangaInfo extends AppCompatActivity {

    private MangaViewModel mangaViewModel;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.manga_layout);

            mangaViewModel = new ViewModelProvider(this).get(MangaViewModel.class);

            String id = getIntent().getStringExtra(MANGA_ID);

            initManga(id);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @SuppressLint("SetTextI18n")
    private void initManga(String id) throws ParseException {
        Manga manga = mangaViewModel.getMangaByID(id);
        ImageView image = findViewById(R.id.manga_image);
        TextView title = findViewById(R.id.manga_title);
        TextView titleJp = findViewById(R.id.manga_title_jp);
        TextView type = findViewById(R.id.manga_type);
        TextView year = findViewById(R.id.manga_year);
        TextView volumes = findViewById(R.id.manga_volumes);
        TextView chapters = findViewById(R.id.manga_chapters);
        TextView genres = findViewById(R.id.manga_genres);
        TextView description = findViewById(R.id.manga_description);

        Picasso.get().load(manga.getMainPicture().getLarge()).into(image);
        image.setContentDescription(manga.getTitle());
        title.setText(manga.getTitle());
        titleJp.setText(manga.getAlternativeTitles().getJa());
        type.setText(manga.getMediaType().toUpperCase() + ",");
        year.setText(DateUtils.initDate(manga.getStartDate()));
        volumes.setText(manga.getNumVolumes() + " vols, ");
        chapters.setText(manga.getNumChapters() + " chaps");
        genres.setText(manga.getGenres().stream().map(Object::toString).collect(Collectors.joining(", ")));
        description.setText(manga.getSynopsis());
    }
}
