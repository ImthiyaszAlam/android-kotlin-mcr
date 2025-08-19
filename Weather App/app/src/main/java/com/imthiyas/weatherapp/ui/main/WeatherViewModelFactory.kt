package com.imthiyas.weatherapp.ui.main

import androidx.lifecycle.ViewModelProvider
import com.imthiyas.weatherapp.data.repository.WeatherRepository

class WeatherViewModelFactory(private val repository: WeatherRepository) :
    ViewModelProvider.Factory {
}