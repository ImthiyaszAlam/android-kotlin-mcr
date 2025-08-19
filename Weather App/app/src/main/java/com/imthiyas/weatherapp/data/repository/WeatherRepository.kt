package com.imthiyas.weatherapp.data.repository

import com.imthiyas.weatherapp.data.model.WeatherResponse
import com.imthiyas.weatherapp.data.remote.RetrofitInstance
import com.imthiyas.weatherapp.util.Constants

class WeatherRepository {
    suspend fun getWeather(city: String): WeatherResponse {
        return RetrofitInstance.api.getWeather(city, Constants.API_KEY)
    }
}