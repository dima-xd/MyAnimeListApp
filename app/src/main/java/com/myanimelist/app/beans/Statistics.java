package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class Statistics {

    @SerializedName("status")
    private Status status;

    @SerializedName("num_list_users")
    private Integer numListUsers;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getNumListUsers() {
        return numListUsers;
    }

    public void setNumListUsers(Integer numListUsers) {
        this.numListUsers = numListUsers;
    }

}