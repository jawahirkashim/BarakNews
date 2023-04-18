package com.example.baraknews.ui.recycleView

import androidx.recyclerview.widget.DiffUtil
import com.example.baraknews.db.NewsHeadline

class NewsHeadlineComparator : DiffUtil.ItemCallback<NewsHeadline>() {
    override fun areItemsTheSame(oldItem: NewsHeadline, newItem: NewsHeadline) =
        oldItem.url == newItem.url

    override fun areContentsTheSame(oldItem: NewsHeadline, newItem: NewsHeadline) =
        oldItem == newItem
}