package com.pavlovic.bojan.weatherforecast.model;


import com.google.gson.annotations.SerializedName;

public class Wind {
    @SerializedName("speed")
    private float speed;

    @SerializedName("deg")
    private float deg;

    public float getSpeed(){
        return speed;
    }

    public float getWindDegree(){
        return deg;
    }
}
