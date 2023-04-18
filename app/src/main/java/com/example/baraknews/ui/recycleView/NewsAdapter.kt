package com.example.baraknews.ui.recycleView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.baraknews.databinding.ItemNewsHeadlineBinding
import com.example.baraknews.db.NewsHeadline


class NewsAdapter() : ListAdapter<NewsHeadline, NewsViewHolder>(NewsHeadlineComparator()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val binder =
            ItemNewsHeadlineBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsViewHolder(binder)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(it)
        }
    }

}

