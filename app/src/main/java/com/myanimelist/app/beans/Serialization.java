package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class Serialization {

    @SerializedName("node")
    private SerializationNode node;

    public SerializationNode getNode() {
        return node;
    }

    public void setNode(SerializationNode node) {
        this.node = node;
    }
}
