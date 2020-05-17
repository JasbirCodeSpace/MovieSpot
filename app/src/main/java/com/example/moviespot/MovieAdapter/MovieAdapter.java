package com.example.moviespot.MovieAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.moviespot.MovieModel.Movie;
import com.example.moviespot.R;
import com.example.moviespot.Utils.OnItemClickListener;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{

    List<Movie> movies;
    OnItemClickListener clickListener;

    public void MovieAdapter(List<Movie> movies, OnItemClickListener clickListener){
        this.movies = movies;
        this.clickListener = clickListener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.movie_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(movies.get(position),clickListener);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView poster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.iv_movie);
        }
        public void onBind(final Movie movie, final OnItemClickListener listener){
            Glide.with(itemView.getContext())
                    .load(posterPath(movie.getmPoster()))
                    .into(poster);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(movie);
                }
            });
        }
    }

    private static String posterPath(String res){
        return "https://image.tmdb.org/t/p/" + "w500" +res;
    }
}
