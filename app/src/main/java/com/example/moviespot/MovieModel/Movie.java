package com.example.moviespot.MovieModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Movie implements Serializable {
    @SerializedName("id")
    @Expose
    private int mId;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("vote_average")
    @Expose
    private String mVoteAverage;

    @SerializedName("vote_count")
    @Expose
    private String mVoteCount;

    @SerializedName("poster_path")
    @Expose
    private String mPoster;

    @SerializedName("release_date")
    @Expose
    private String mReleaseDate;

    @SerializedName("overview")
    @Expose
    private String mOverView;

    @SerializedName("cast")
    @Expose
    private String mCast;

    @SerializedName("popularity")
    @Expose
    private String mPopularity;

    public Movie(String mTitle,String mRating,String mPoster,String mReleaseDate,String mOverView,String mCast){
        this.mTitle = mTitle;
        this.mPoster = mPoster;
        this.mReleaseDate = mReleaseDate;
        this.mOverView = mOverView;
        this.mCast = mCast;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmOverView(String mOverView) {
        this.mOverView = mOverView;
    }

    public void setmPoster(String mPoster) {
        this.mPoster = mPoster;
    }

    public void setmCast(String mCast) {
        this.mCast = mCast;
    }

    public void setmReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
    }

    public void setmPopularity(String mPopularity) {
        this.mPopularity = mPopularity;
    }

    public void setmVoteAverage(String mVoteAverage) {
        this.mVoteAverage = mVoteAverage;
    }

    public void setmVoteCount(String mVoteCount) {
        this.mVoteCount = mVoteCount;
    }

    public int getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmOverView() {
        return mOverView;
    }

    public String getmPoster() {
        return mPoster;
    }


    public String getmCast() {
        return mCast;
    }

    public String getmReleaseDate() {
        return mReleaseDate;
    }

    public String getmVoteAverage() {
        return mVoteAverage;
    }

    public String getmPopularity() {
        return mPopularity;
    }

    public String getmVoteCount() {
        return mVoteCount;
    }
}
