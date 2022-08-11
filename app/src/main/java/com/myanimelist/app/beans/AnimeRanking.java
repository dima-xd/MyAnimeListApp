package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnimeRanking {

    @SerializedName("data")
    private List<Data> data = null;

    @SerializedName("paging")
    private Paging paging;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @Override
    public String toString() {
        return "AnimeRanking{" +
                "data=" + data +
                ", paging=" + paging +
                '}';
    }
}
