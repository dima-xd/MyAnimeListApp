package com.myanimelist.app.constants;

public class Constants {
    public static final String MAL_TOKEN_META_DATA = "mal_token";

    public static class API {

        public static final String MAL_BASE_URL = "https://api.myanimelist.net/v2/";

        public static final String FIELDS_ANIME = "id,title,main_picture,alternative_titles,start_date,end_date," +
                "synopsis,mean,rank,popularity,num_list_users,num_scoring_users,nsfw,created_at," +
                "updated_at,media_type,status,genres,my_list_status,num_episodes,start_season," +
                "broadcast,source,average_episode_duration,rating,pictures,background,related_anime," +
                "recommendations,studios,statistics";

        public static final String FIELDS_MANGA = "id,title,main_picture,alternative_titles,start_date,end_date," +
                "synopsis,mean,rank,popularity,num_list_users,num_scoring_users,nsfw,created_at," +
                "updated_at,media_type,status,genres,my_list_status,num_volumes,num_chapters," +
                "authors{first_name,last_name},pictures,background,related_anime,related_manga,recommendations," +
                "serialization{name}";
    }
}
