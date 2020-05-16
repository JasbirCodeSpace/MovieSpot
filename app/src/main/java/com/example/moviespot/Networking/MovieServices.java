package com.example.moviespot.Networking;

import com.example.moviespot.MovieModel.MovieAPIResults;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieServices {

    @GET("movies/top_rated")
    Call<MovieAPIResults> getTopRatedMovies(@Query("page") int page, @Query("api_key") String apiKey);

    @GET("movies/popular")
    Call<MovieAPIResults> getPopularMovies(@Query("page") int page, @Query("api_key") String apiKey);
}
