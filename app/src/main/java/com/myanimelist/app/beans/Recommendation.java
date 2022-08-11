package com.myanimelist.app.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Recommendation {

    @SerializedName("node")
    @Expose
    private Anime node;
    @SerializedName("num_recommendations")
    @Expose
    private Integer numRecommendations;

    public Anime getNode() {
        return node;
    }

    public void setNode(Anime node) {
        this.node = node;
    }

    public Integer getNumRecommendations() {
        return numRecommendations;
    }

    public void setNumRecommendations(Integer numRecommendations) {
        this.numRecommendations = numRecommendations;
    }

}