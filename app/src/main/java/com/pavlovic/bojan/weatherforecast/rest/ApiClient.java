package com.pavlovic.bojan.weatherforecast.rest;

import com.pavlovic.bojan.weatherforecast.constants.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// Get instance of Retrofit class.
// For converting JSON used Gson converter factory.
public class ApiClient {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.OPEN_WEATHER_MAP_API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
