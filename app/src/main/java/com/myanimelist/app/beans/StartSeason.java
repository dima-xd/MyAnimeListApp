package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class StartSeason {

    @SerializedName("year")
    private Integer year;

    @SerializedName("season")
    private String season;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

}