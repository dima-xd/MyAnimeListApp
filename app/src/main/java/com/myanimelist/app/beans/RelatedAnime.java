package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class RelatedAnime {

    @SerializedName("node")
    private Anime node;

    @SerializedName("relation_type")
    private String relationType;

    @SerializedName("relation_type_formatted")
    private String relationTypeFormatted;

    public Anime getNode() {
        return node;
    }

    public void setNode(Anime node) {
        this.node = node;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    public String getRelationTypeFormatted() {
        return relationTypeFormatted;
    }

    public void setRelationTypeFormatted(String relationTypeFormatted) {
        this.relationTypeFormatted = relationTypeFormatted;
    }

}