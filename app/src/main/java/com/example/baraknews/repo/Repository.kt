package com.example.baraknews.repo

import android.util.Log
import com.example.baraknews.api.API
import com.example.baraknews.api.Articles
import javax.inject.Inject

class Repository @Inject constructor(val api: API) {
    suspend fun getNewsHighlight():Articles{
        val response = api.getNewsHeadlines()
        val articles = response.articles
        Log.d("Reposiory", "getNewsHighlight: ${articles.size}")
        return response
    }
}