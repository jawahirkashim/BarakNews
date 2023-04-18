package com.example.baraknews.repo

import com.example.baraknews.api.API
import com.example.baraknews.db.NewsHeadline
import javax.inject.Inject

class Repository @Inject constructor(private val api: API) {
    suspend fun getNewsHighlight(): List<NewsHeadline> {
        val response = api.getNewsHeadlines()
        val newsHeadLines = response.articles.map {
            NewsHeadline(
                title = it.title,
                url = it.url,
                thumbNail = it.urlToImage
            )
        }
        return newsHeadLines
    }
}