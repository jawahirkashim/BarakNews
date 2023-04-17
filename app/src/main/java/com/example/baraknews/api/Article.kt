package com.example.baraknews.api

import java.net.URL

data class News(val title:String, val urlToImage:URL)

data class Articles(val articles:List<News>)
