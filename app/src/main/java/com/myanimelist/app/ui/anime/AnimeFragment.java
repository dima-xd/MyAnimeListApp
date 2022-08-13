package com.myanimelist.app.ui.anime;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.myanimelist.app.R;
import com.myanimelist.app.adapters.AnimeRankingAdapter;
import com.myanimelist.app.beans.AnimeRanking;
import com.myanimelist.app.beans.DataAnime;
import com.myanimelist.app.databinding.FragmentAnimeBinding;
import com.myanimelist.app.listeners.RecyclerItemClickListener;

import java.util.ArrayList;

import static com.myanimelist.app.constants.Constants.*;

public class AnimeFragment extends Fragment {

    private FragmentAnimeBinding binding;
    private AnimeViewModel animeViewModel;
    private AnimeRanking animeRanking;

    private final String LIMIT_ITEMS = "60";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        animeViewModel =
                new ViewModelProvider(this).get(AnimeViewModel.class);

        binding = FragmentAnimeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        BottomNavigationView bottomNavigationView = getActivity().findViewById(R.id.nav_view);

        RecyclerView recyclerView = binding.recycler;
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        animeRanking = animeViewModel.getAnimeRanking(LIMIT_ITEMS, "0");

        AnimeRankingAdapter adapter =
                new AnimeRankingAdapter(animeRanking.getData());
        recyclerView.setAdapter(adapter);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    if (!recyclerView.canScrollVertically(1)) {
                        ArrayList<DataAnime> list = adapter.getAnimeList();
                        AnimeRanking newAnimeRanking = animeViewModel.getAnimeRanking(LIMIT_ITEMS,
                                Integer.toString(list.size()));
                        adapter.getAnimeList().addAll(newAnimeRanking.getData());
                        adapter.notifyItemRangeChanged(list.size(), 60);
                    } else {
                        if (bottomNavigationView != null) {
                            bottomNavigationView.setVisibility(View.VISIBLE);
                        }
                    }
                }
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy != 0) {
                    if (bottomNavigationView != null) {
                        bottomNavigationView.setVisibility(View.GONE);
                    }
                }
            }
        });
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Intent intent = new Intent(getActivity(), AnimeInfo.class);
                        intent.putExtra(ANIME_ID, adapter.getAnimeList().get(position).getNode().getId());
                        startActivity(intent);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {}
                }));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}