package com.pavlovic.bojan.weatherforecast.rest;


import com.pavlovic.bojan.weatherforecast.model.CurrentWeatherResponse;
import com.pavlovic.bojan.weatherforecast.model.ForecastWeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("data/2.5/weather?")
    Call<CurrentWeatherResponse> getCurrentWeather(@Query("lat") double lat, @Query("lon") double lon, @Query("appid") String appId);

    @GET("data/2.5/forecast?")
    Call<ForecastWeatherResponse> getForecastWeather(@Query("lat") double lat, @Query("lon") double lon, @Query("appid") String appId);
}
