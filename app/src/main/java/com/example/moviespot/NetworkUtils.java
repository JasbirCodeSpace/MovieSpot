package com.example.moviespot;

import android.net.Uri;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class NetworkUtils {
    private static final String popularMovies = "popularity.desc";
    private static final String topRatedMovies = "vote_average.desc";

    private static final String MOVIES_PARAM="sort_by";
    private static final String API_PARAM="api_key";
    private static final String MOVIE_DB_BASE_URL = "http://api.themoviedb.org/3/discover/movie";
    private static final String API_KEY = "a25592d6509c51f48ff31ed09207fbaf";

    private static final String TAG = NetworkUtils.class.getSimpleName();
    private Object IOUtils;

    public URL buildUrl(String movieParam){
        Uri builtUri = Uri.parse(MOVIE_DB_BASE_URL).buildUpon()
                        .appendQueryParameter(MOVIES_PARAM,movieParam)
                        .appendQueryParameter(API_PARAM,API_KEY)
                        .build();
        URL url = null;
        try{
            url = new URL(builtUri.toString());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

        return url;
    }
    public ArrayList<Movie> fetchMoviesFromURL(URL url) throws IOException {

        ArrayList<Movie> movies = new ArrayList<>();
        try{
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            InputStream in = urlConnection.getInputStream();

            String results = IOUtils.toString();
            parseJson(results,movies);
        }catch (IOException e){
            e.printStackTrace();
        }finally{

        }

    }


}
