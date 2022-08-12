package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MangaRanking {

    @SerializedName("data")
    private List<DataManga> data = null;

    @SerializedName("paging")
    private Paging paging;

    public List<DataManga> getData() {
        return data;
    }

    public void setData(List<DataManga> data) {
        this.data = data;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}
