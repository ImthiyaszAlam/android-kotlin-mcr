package com.imthiyas.weatherapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.imthiyas.weatherapp.data.model.WeatherResponse
import com.imthiyas.weatherapp.util.Resource

class WeatherViewModel : ViewModel() {

    private var _weather = MutableLiveData<Resource<WeatherResponse>>()

    fun fetchWeather(city: String) {

    }
}