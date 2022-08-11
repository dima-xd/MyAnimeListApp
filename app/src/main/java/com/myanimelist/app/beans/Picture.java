package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class Picture {

    @SerializedName("medium")
    private String medium;

    @SerializedName("large")
    private String large;

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

}