package com.myanimelist.app.beans;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class AlternativeTitles {

    @SerializedName("synonyms")
    private List<String> synonyms = null;

    @SerializedName("en")
    private String en;

    @SerializedName("ja")
    private String ja;

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

}