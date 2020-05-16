package com.example.moviespot.MovieAdapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.moviespot.MovieModel.Movie;
import com.example.moviespot.Utils.OnItemClickListener;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter{

    List<Movie> movies;
    OnItemClickListener clickListener;

    public void MovieAdapter(List<Movie> movies, OnItemClickListener clickListener){
        this.movies = movies;
        this.clickListener = clickListener;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
