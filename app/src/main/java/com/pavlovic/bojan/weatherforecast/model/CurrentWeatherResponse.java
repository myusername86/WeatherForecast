package com.pavlovic.bojan.weatherforecast.model;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

//This class represents structure of response object we get from OpenWeatherMap API when we are retrieving current weather.
public class CurrentWeatherResponse {

    @SerializedName("dt")
    private long dt;

    @SerializedName("name")
    private String name;

    @SerializedName("coord")
    private Coordinates coord;

    @SerializedName("weather")
    private List<Weather> weather = new ArrayList<>();

    @SerializedName("main")
    private MainData main;

    @SerializedName("wind")
    private Wind wind;

    @SerializedName("clouds")
    private Clouds clouds;

    @SerializedName("sys")
    private SysData sys;


    // Getter functions
    public long getDateTimeStamp(){
        return dt;
    }

    public String getCityName(){
        return name;
    }

    public Coordinates getCoordinates(){
        return coord;
    }

    public Weather getWeather(){
        //In OpenWeatherMap we get array of Weather objects, which consists of only one object with index of 0.
        //Because of that we are returning only first object from that array.
        return weather.get(0);
    }

    public MainData getMainWeatherData(){
        return main;
    }

    public Wind getWind(){
        return wind;
    }

    public Clouds getClouds(){
        return clouds;
    }

    public SysData getSysData(){
        return sys;
    }
}
