package com.example.baraknews.api

data class News(val title: String?, val urlToImage: String?, val url: String)

data class Articles(val articles: List<News>)
