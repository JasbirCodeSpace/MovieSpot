package com.example.moviespot;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{

    private ArrayList<Movie> movies;
    private MovieAdapterOnClickHandler mClickHandler;

    public MovieAdapter(MovieAdapterOnClickHandler clickHandler){
        this.mClickHandler = clickHandler;
    }
    public interface MovieAdapterOnClickHandler{
        void onClick(Movie movie);
    }

}
