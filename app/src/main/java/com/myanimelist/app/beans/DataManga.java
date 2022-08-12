package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class DataManga {

    @SerializedName("node")
    private Manga node;

    @SerializedName("ranking")
    private Ranking ranking;

    public Manga getNode() {
        return node;
    }

    public void setNode(Manga node) {
        this.node = node;
    }

    public Ranking getRanking() {
        return ranking;
    }

    public void setRanking(Ranking ranking) {
        this.ranking = ranking;
    }
}
