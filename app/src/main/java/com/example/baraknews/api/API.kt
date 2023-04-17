package com.example.baraknews.api

import com.example.baraknews.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Headers

interface API {
    companion object {
        const val BASE_URL = "https://newsapi.org/v2/"
        const val KEY = BuildConfig.API_ACCESS_KEY
    }

    @Headers("X-Api-Key: $KEY")
    @GET("top-headlines?country=us")
    suspend fun getNewsHeadlines(): Articles
}