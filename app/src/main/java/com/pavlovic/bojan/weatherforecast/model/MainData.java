package com.pavlovic.bojan.weatherforecast.model;


import com.google.gson.annotations.SerializedName;

public class MainData {
    @SerializedName("temp")
    private float temp;

    @SerializedName("pressure")
    private float pressure;

    @SerializedName("humidity")
    private float humidity;

    public float getTemperature(){
        return temp;
    }

    public float getPressure(){
        return pressure;
    }

    public float getHumidity(){
        return humidity;
    }
}
