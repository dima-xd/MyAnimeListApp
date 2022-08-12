package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("node")
    private AuthorNode node;

    @SerializedName("role")
    private String role;

    public AuthorNode getNode() {
        return node;
    }

    public void setNode(AuthorNode node) {
        this.node = node;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
