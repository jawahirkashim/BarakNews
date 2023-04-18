package com.example.baraknews.db

data class NewsHeadline(
    val title:String?,
    val url: String,
    val thumbNail: String?,
    val updatedAt:Long = System.currentTimeMillis()
)
