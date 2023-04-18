package com.example.baraknews

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.baraknews.databinding.ActivityMainBinding
import com.example.baraknews.ui.NewsViewModel
import com.example.baraknews.ui.recycleView.NewsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: NewsViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    lateinit var newsAdapter: NewsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this), null, false)
        setContentView(binding.root)

        newsAdapter = NewsAdapter()
        binding.apply {
            recyclerView.apply {
                adapter = newsAdapter
                layoutManager = LinearLayoutManager(this@MainActivity)
            }

            MainScope().launch(Dispatchers.IO) {
                viewModel.news.collect {
                    newsAdapter.submitList(it)
                }
            }
        }
    }
}