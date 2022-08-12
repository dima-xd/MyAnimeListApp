package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class RelatedManga {

    @SerializedName("node")
    private Manga node;

    @SerializedName("relation_type")
    private String relationType;

    @SerializedName("relation_type_formatted")
    private String relationTypeFormatted;

    public Manga getNode() {
        return node;
    }

    public void setNode(Manga node) {
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
