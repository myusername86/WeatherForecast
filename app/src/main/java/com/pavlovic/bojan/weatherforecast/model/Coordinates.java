package com.pavlovic.bojan.weatherforecast.model;

import com.google.gson.annotations.SerializedName;


public class Coordinates {
    @SerializedName("lon")
    private double lon;
    @SerializedName("lat")
    private double lat;

    public double getLongitude(){
        return lon;
    }

    public double getLatitude(){
        return lat;
    }
}
