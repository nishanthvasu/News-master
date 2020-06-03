package com.nishanth.newsapp.news.di

import androidx.lifecycle.ViewModel
import com.nishanth.newsapp.core.di.base.ViewModelKey
import com.nishanth.newsapp.news.ui.viewmodel.NewsArticleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface NewsViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(NewsArticleViewModel::class)
    fun bindNewsArticleViewModel(newsArticleViewModel: NewsArticleViewModel): ViewModel
}