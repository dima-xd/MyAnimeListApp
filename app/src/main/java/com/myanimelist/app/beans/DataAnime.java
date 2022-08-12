package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class DataAnime {

    @SerializedName("node")
    private Anime node;

    @SerializedName("ranking")
    private Ranking ranking;

    public Anime getNode() {
        return node;
    }

    public void setNode(Anime node) {
        this.node = node;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }

}
