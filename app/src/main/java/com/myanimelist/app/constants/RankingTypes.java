package com.myanimelist.app.constants;

public enum RankingTypes {
    ALL("all"), AIRING("airing"), UPCOMING("upcoming"),
    TV("tv"), OVA("ova"), MOVIE("movie"),
    SPECIAL("special"), BYPOPULARITY("bypopularity"), FAVORITE("favorite");

    private String type;

    RankingTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
