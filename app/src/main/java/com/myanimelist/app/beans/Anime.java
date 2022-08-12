package com.myanimelist.app.beans;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Anime {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("main_picture")
    private MainPicture mainPicture;

    @SerializedName("alternative_titles")
    private AlternativeTitles alternativeTitles;

    @SerializedName("start_date")
    private String startDate;

    @SerializedName("end_date")
    private String endDate;

    @SerializedName("synopsis")
    private String synopsis;

    @SerializedName("mean")
    private float mean;

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

    @SerializedName("num_episodes")
    private String numEpisodes;

    @SerializedName("start_season")
    private StartSeason startSeason;

    @SerializedName("broadcast")
    private Broadcast broadcast;

    @SerializedName("source")
    private String source;

    @SerializedName("average_episode_duration")
    private Integer averageEpisodeDuration;

    @SerializedName("rating")
    private String rating;

    @SerializedName("pictures")
    private List<Picture> pictures = null;

    @SerializedName("background")
    private String background;

    @SerializedName("related_anime")
    private List<RelatedAnime> relatedAnime = null;

    @SerializedName("related_manga")
    private List<Object> relatedManga = null;

    @SerializedName("recommendations")
    private List<Recommendation> recommendations = null;

    @SerializedName("studios")
    private List<Studio> studios = null;

    @SerializedName("statistics")
    private Statistics statistics;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public float getMean() {
        return mean;
    }

    public void setMean(float mean) {
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

    public String getNumEpisodes() {
        return numEpisodes;
    }

    public void setNumEpisodes(String numEpisodes) {
        this.numEpisodes = numEpisodes;
    }

    public StartSeason getStartSeason() {
        return startSeason;
    }

    public void setStartSeason(StartSeason startSeason) {
        this.startSeason = startSeason;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getAverageEpisodeDuration() {
        return averageEpisodeDuration;
    }

    public void setAverageEpisodeDuration(Integer averageEpisodeDuration) {
        this.averageEpisodeDuration = averageEpisodeDuration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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

    public List<RelatedAnime> getRelatedAnime() {
        return relatedAnime;
    }

    public void setRelatedAnime(List<RelatedAnime> relatedAnime) {
        this.relatedAnime = relatedAnime;
    }

    public List<Object> getRelatedManga() {
        return relatedManga;
    }

    public void setRelatedManga(List<Object> relatedManga) {
        this.relatedManga = relatedManga;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }

    public List<Studio> getStudios() {
        return studios;
    }

    public void setStudios(List<Studio> studios) {
        this.studios = studios;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

}