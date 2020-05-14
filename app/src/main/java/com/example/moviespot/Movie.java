package com.example.moviespot;

public class Movie{
    private String mTitle,mRating,mPoster,mReleaseDate,mOverView,mCast;
    private int mId;

    public MovieModel(String mTitle,String mRating,String mPoster,String mReleaseDate,String mOverView,String mCast){
        this.mTitle = mTitle;
        this.mRating = mRating;
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

    public void setmRating(String mRating) {
        this.mRating = mRating;
    }

    public void setmReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
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

    public String getmRating() {
        return mRating;
    }

    public String getmCast() {
        return mCast;
    }

    public String getmReleaseDate() {
        return mReleaseDate;
    }
}
