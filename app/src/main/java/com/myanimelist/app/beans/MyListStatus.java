package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class MyListStatus {

    @SerializedName("status")
    private String status;

    @SerializedName("score")
    private Integer score;

    @SerializedName("num_episodes_watched")
    private Integer numEpisodesWatched;

    @SerializedName("is_rewatching")
    private Boolean isRewatching;

    @SerializedName("updated_at")
    private String updatedAt;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getNumEpisodesWatched() {
        return numEpisodesWatched;
    }

    public void setNumEpisodesWatched(Integer numEpisodesWatched) {
        this.numEpisodesWatched = numEpisodesWatched;
    }

    public Boolean getIsRewatching() {
        return isRewatching;
    }

    public void setIsRewatching(Boolean isRewatching) {
        this.isRewatching = isRewatching;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}