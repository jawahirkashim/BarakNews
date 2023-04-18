package com.example.baraknews.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.baraknews.db.NewsHeadline
import com.example.baraknews.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val newsHeadLine = MutableStateFlow<List<NewsHeadline>>(emptyList())
    val news: Flow<List<NewsHeadline>> = newsHeadLine

    init {
        viewModelScope.launch(Dispatchers.IO) {
            newsHeadLine.value = repository.getNewsHighlight()
        }

    }

}