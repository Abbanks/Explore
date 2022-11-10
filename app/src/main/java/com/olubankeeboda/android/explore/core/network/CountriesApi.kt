package com.olubankeeboda.android.explore.core.network

import com.olubankeeboda.android.explore.core.network.model.CountriesContainer
import retrofit2.http.GET

interface CountriesApi {
    @GET("all")
    suspend fun getCountries(): CountriesContainer
}