package com.pavlovic.bojan.weatherforecast.model;


import com.google.gson.annotations.SerializedName;

public class Clouds {
    @SerializedName("clouds")
    private int clouds;

    public int getCloudinessPercentage(){
        return clouds;
    }
}
