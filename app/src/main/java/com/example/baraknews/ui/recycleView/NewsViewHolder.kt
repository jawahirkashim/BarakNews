package com.example.baraknews.ui.recycleView

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.baraknews.R
import com.example.baraknews.databinding.ItemNewsHeadlineBinding
import com.example.baraknews.db.NewsHeadline

class NewsViewHolder(
    private val binding: ItemNewsHeadlineBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(newsHeadline: NewsHeadline) {
        binding.apply {
            Glide.with(itemView).load(newsHeadline.thumbNail)
                .error(R.drawable.error_image_placeholder).into(thumbnailIv)

            titleTv.text = newsHeadline.title?:""

        }
    }

}