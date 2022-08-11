package com.myanimelist.app.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myanimelist.app.R;
import com.myanimelist.app.beans.Anime;
import com.myanimelist.app.beans.Data;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AnimeRankingAdapter extends RecyclerView.Adapter<AnimeRankingAdapter.AnimeRankingViewHolder> {

    private ArrayList<Data> animeList;

    @NonNull
    @Override
    public AnimeRankingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.anime_card, parent, false);
        return new AnimeRankingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeRankingViewHolder holder, int position) {
        TextView titleView = holder.title;
        RatingBar ratingBar = holder.rating;
        TextView descriptionView = holder.description;
        ImageView imageView = holder.image;

        Anime anime = animeList.get(position).getNode();
        titleView.setText(anime.getTitle());
        ratingBar.setRating(anime.getMean());
        descriptionView.setText(anime.getSynopsis());
        Picasso.get().load(anime.getMainPicture().getMedium()).into(imageView);
        imageView.setContentDescription(anime.getTitle());
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public static class AnimeRankingViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private RatingBar rating;
        private TextView description;
        private ImageView image;

        public AnimeRankingViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.anime_card_title);
            this.rating = itemView.findViewById(R.id.anime_card_rating);
            this.description = itemView.findViewById(R.id.anime_card_description);
            this.image = itemView.findViewById(R.id.anime_card_image);
        }
    }

    public AnimeRankingAdapter(List<Data> animeList) {
        this.animeList = new ArrayList<>(animeList);
    }

    public ArrayList<Data> getAnimeList() {
        return animeList;
    }

    public void setAnimeList(ArrayList<Data> animeList) {
        this.animeList = animeList;
    }

}
