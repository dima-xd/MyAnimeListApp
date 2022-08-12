package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Manga {

    @SerializedName("id")
    private Integer id;

    @SerializedName("title")
    private String title;

    @SerializedName("main_picture")
    private MainPicture mainPicture;

    @SerializedName("alternative_titles")
    private AlternativeTitles alternativeTitles;

    @SerializedName("start_date")
    private String startDate;

    @SerializedName("synopsis")
    private String synopsis;

    @SerializedName("mean")
    private Float mean;

    @SerializedName("rank")
    private Integer rank;

    @SerializedName("popularity")
    private Integer popularity;

    @SerializedName("num_list_users")
    private Integer numListUsers;

    @SerializedName("num_scoring_users")
    private Integer numScoringUsers;

    @SerializedName("nsfw")
    private String nsfw;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("media_type")
    private String mediaType;

    @SerializedName("status")
    private String status;

    @SerializedName("genres")
    private List<Genre> genres = null;

    @SerializedName("my_list_status")
    private MyListStatus myListStatus;

    @SerializedName("num_volumes")
    private Integer numVolumes;

    @SerializedName("num_chapters")
    private Integer numChapters;

    @SerializedName("authors")
    private List<Author> authors = null;

    @SerializedName("pictures")
    private List<Picture> pictures = null;

    @SerializedName("background")
    private String background;

    @SerializedName("related_anime")
    private List<Object> relatedAnime = null;

    @SerializedName("related_manga")
    private List<RelatedManga> relatedManga = null;

    @SerializedName("recommendations")
    private List<Recommendation> recommendations = null;

    @SerializedName("serialization")
    private List<Serialization> serialization = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MainPicture getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(MainPicture mainPicture) {
        this.mainPicture = mainPicture;
    }

    public AlternativeTitles getAlternativeTitles() {
        return alternativeTitles;
    }

    public void setAlternativeTitles(AlternativeTitles alternativeTitles) {
        this.alternativeTitles = alternativeTitles;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Float getMean() {
        return mean;
    }

    public void setMean(Float mean) {
        this.mean = mean;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Integer getNumListUsers() {
        return numListUsers;
    }

    public void setNumListUsers(Integer numListUsers) {
        this.numListUsers = numListUsers;
    }

    public Integer getNumScoringUsers() {
        return numScoringUsers;
    }

    public void setNumScoringUsers(Integer numScoringUsers) {
        this.numScoringUsers = numScoringUsers;
    }

    public String getNsfw() {
        return nsfw;
    }

    public void setNsfw(String nsfw) {
        this.nsfw = nsfw;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public MyListStatus getMyListStatus() {
        return myListStatus;
    }

    public void setMyListStatus(MyListStatus myListStatus) {
        this.myListStatus = myListStatus;
    }

    public Integer getNumVolumes() {
        return numVolumes;
    }

    public void setNumVolumes(Integer numVolumes) {
        this.numVolumes = numVolumes;
    }

    public Integer getNumChapters() {
        return numChapters;
    }

    public void setNumChapters(Integer numChapters) {
        this.numChapters = numChapters;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public List<Object> getRelatedAnime() {
        return relatedAnime;
    }

    public void setRelatedAnime(List<Object> relatedAnime) {
        this.relatedAnime = relatedAnime;
    }

    public List<RelatedManga> getRelatedManga() {
        return relatedManga;
    }

    public void setRelatedManga(List<RelatedManga> relatedManga) {
        this.relatedManga = relatedManga;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public List<Serialization> getSerialization() {
        return serialization;
    }

    public void setSerialization(List<Serialization> serialization) {
        this.serialization = serialization;
    }

}
