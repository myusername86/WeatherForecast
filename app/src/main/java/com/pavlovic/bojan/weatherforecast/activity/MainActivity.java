package com.pavlovic.bojan.weatherforecast.activity;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.pavlovic.bojan.weatherforecast.R;
import com.pavlovic.bojan.weatherforecast.constants.Constants;
import com.pavlovic.bojan.weatherforecast.model.CurrentWeatherResponse;
import com.pavlovic.bojan.weatherforecast.rest.ApiClient;
import com.pavlovic.bojan.weatherforecast.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity /*implements SwipeRefreshLayout.OnRefreshListener*/{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<CurrentWeatherResponse> call = apiService.getCurrentWeather(44.7866d, 20.4489d, Constants.OPEN_WEATHER_MAP_API_ID);
        call.enqueue(new Callback<CurrentWeatherResponse>() {
            @Override
            public void onResponse(Call<CurrentWeatherResponse> call, Response<CurrentWeatherResponse> response) {
                CurrentWeatherResponse currentWeatherResponse = response.body();
                String cityName = currentWeatherResponse.getCityName();
                int cloudPercentage = currentWeatherResponse.getClouds().getCloudinessPercentage();
                double latitude = currentWeatherResponse.getCoordinates().getLatitude();
                double longitude = currentWeatherResponse.getCoordinates().getLongitude();
                long dt = currentWeatherResponse.getDateTimeStamp();
                float humidity = currentWeatherResponse.getMainWeatherData().getHumidity();
                float pressure = currentWeatherResponse.getMainWeatherData().getPressure();
                float temperature = currentWeatherResponse.getMainWeatherData().getTemperature();
                String country = currentWeatherResponse.getSysData().getCountry();
                long sunrise = currentWeatherResponse.getSysData().getSunrise();
                long sunset = currentWeatherResponse.getSysData().getSunset();
                String descr = currentWeatherResponse.getWeather().getDescription();
                String icon = currentWeatherResponse.getWeather().getIcon();
                String mainstring = currentWeatherResponse.getWeather().getMain();
                float windSpeed = currentWeatherResponse.getWind().getSpeed();
                float windDegree = currentWeatherResponse.getWind().getWindDegree();

                Log.i("WEATHER", "onResponse called");
            }

            @Override
            public void onFailure(Call<CurrentWeatherResponse> call, Throwable t) {
                Log.e("WEATHER", "onFailure called");
            }
        });

    }

//    @Override
//    public void onRefresh() {
//        Log.i("WEATHER", "onRefresh");
//    }
}
