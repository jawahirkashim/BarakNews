package com.example.baraknews.ui

import androidx.lifecycle.ViewModel
import com.example.baraknews.api.Articles
import com.example.baraknews.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    suspend fun getNewsHighlight():Articles
     = repository.getNewsHighlight()

}