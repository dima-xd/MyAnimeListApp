package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class Paging {

    @SerializedName("next")
    private String next;

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

}
