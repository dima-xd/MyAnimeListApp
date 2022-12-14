package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnimeRanking {

    @SerializedName("data")
    private List<DataAnime> data = null;

    @SerializedName("paging")
    private Paging paging;

    public List<DataAnime> getData() {
        return data;
    }

    public void setData(List<DataAnime> data) {
        this.data = data;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

}
