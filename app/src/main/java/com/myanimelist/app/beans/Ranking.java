package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Ranking {

    @SerializedName("rank")
    private Integer rank;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

}
