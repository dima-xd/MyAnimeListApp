package com.myanimelist.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myanimelist.app.R;
import com.myanimelist.app.beans.DataManga;
import com.myanimelist.app.beans.Manga;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MangaRankingAdapter extends RecyclerView.Adapter<MangaRankingAdapter.MangaRankingViewHolder> {

    private ArrayList<DataManga> mangaList;

    @NonNull
    @Override
    public MangaRankingAdapter.MangaRankingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.manga_card, parent, false);
        return new MangaRankingAdapter.MangaRankingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MangaRankingAdapter.MangaRankingViewHolder holder, int position) {
        TextView titleView = holder.title;
        TextView numChaptersView = holder.numChapters;
        TextView ratingBar = holder.rating;
        TextView descriptionView = holder.description;
        ImageView imageView = holder.image;

        Manga manga = mangaList.get(position).getNode();
        titleView.setText(manga.getTitle());
        if (!manga.getNumChapters().equals("0")) {
            numChaptersView.setText(manga.getNumChapters() + " chps");
        } else {
            numChaptersView.setText("? chps");
        }
        ratingBar.setText(String.format("%.1f", manga.getMean()));
        descriptionView.setText(manga.getSynopsis());
        Picasso.get().load(manga.getMainPicture().getMedium()).into(imageView);
        imageView.setContentDescription(manga.getTitle());
    }

    @Override
    public int getItemCount() {
        return mangaList.size();
    }

    public static class MangaRankingViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView numChapters;
        private TextView rating;
        private TextView description;
        private ImageView image;

        public MangaRankingViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.manga_card_title);
            this.numChapters = itemView.findViewById(R.id.manga_card_chapters);
            this.rating = itemView.findViewById(R.id.manga_card_rating);
            this.description = itemView.findViewById(R.id.manga_card_description);
            this.image = itemView.findViewById(R.id.manga_card_image);
        }
    }

    public MangaRankingAdapter(List<DataManga> mangaList) {
        this.mangaList = new ArrayList<>(mangaList);
    }

    public ArrayList<DataManga> getMangaList() {
        return mangaList;
    }

}
