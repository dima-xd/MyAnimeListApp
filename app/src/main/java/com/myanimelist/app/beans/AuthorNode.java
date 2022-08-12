package com.myanimelist.app.beans;

import com.google.gson.annotations.SerializedName;

public class AuthorNode {

    @SerializedName("id")
    private Integer id;

    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
