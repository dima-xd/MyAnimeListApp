package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class Broadcast {

    @SerializedName("day_of_the_week")
    private String dayOfTheWeek;

    @SerializedName("start_time")
    private String startTime;

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

}