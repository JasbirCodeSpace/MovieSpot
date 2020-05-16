package com.example.moviespot.Networking;

import android.content.Context;

import com.example.moviespot.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static MovieServices movieServices;
    public static MovieServices getRetrofitClientInstance(Context context){
        if (movieServices == null){
            Gson gson = new GsonBuilder().create();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(context.getString(R.string.baseURL))
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            movieServices = retrofit.create(MovieServices.class);

        }
        return movieServices;

    }
}
