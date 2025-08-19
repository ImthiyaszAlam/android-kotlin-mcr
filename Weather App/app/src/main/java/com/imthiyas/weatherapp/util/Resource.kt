package com.imthiyas.weatherapp.util

sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {

}