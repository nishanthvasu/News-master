package com.nishanth.newsapp.news.ui.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nishanth.newsapp.R
import com.nishanth.newsapp.news.ui.adapter.NewsArticlesAdapter
import com.nishanth.newsapp.core.ui.ViewState
import com.nishanth.newsapp.core.ui.base.BaseActivity
import com.nishanth.newsapp.news.ui.viewmodel.NewsArticleViewModel
import com.nishanth.newsapp.core.utils.getViewModel
import com.nishanth.newsapp.core.utils.observeNotNull
import com.nishanth.newsapp.core.utils.toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.empty_layout.*
import kotlinx.android.synthetic.main.progress_layout.*

class NewsActivity : BaseActivity() {

    private val newsArticleViewModel by lazy { getViewModel<NewsArticleViewModel>() }

    /**
     * Starting point of the activity
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setting up RecyclerView and adapter
        newsList.setEmptyView(empty_view)
        newsList.setProgressView(progress_view)

        val adapter = NewsArticlesAdapter{}
        newsList.adapter = adapter
        newsList.layoutManager = LinearLayoutManager(this)

        // Update the UI on state change
        newsArticleViewModel.getNewsArticles().observeNotNull(this) { state ->
            when (state) {
                is ViewState.Success -> adapter.submitList(state.data)
                is ViewState.Loading -> newsList.showLoading()
                is ViewState.Error -> toast("Something went wrong ¯\\_(ツ)_/¯ => ${state.message}")
            }
        }

    }
}
