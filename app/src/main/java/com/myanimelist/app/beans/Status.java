package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("watching")
    private String watching;

    @SerializedName("completed")
    private String completed;

    @SerializedName("on_hold")
    private String onHold;

    @SerializedName("dropped")
    private String dropped;

    @SerializedName("plan_to_watch")
    private String planToWatch;

    public String getWatching() {
        return watching;
    }

    public void setWatching(String watching) {
        this.watching = watching;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getOnHold() {
        return onHold;
    }

    public void setOnHold(String onHold) {
        this.onHold = onHold;
    }

    public String getDropped() {
        return dropped;
    }

    public void setDropped(String dropped) {
        this.dropped = dropped;
    }

    public String getPlanToWatch() {
        return planToWatch;
    }

    public void setPlanToWatch(String planToWatch) {
        this.planToWatch = planToWatch;
    }

}