package com.nishanth.newsapp.news.ui.model

import com.nishanth.newsapp.news.ui.adapter.NewsArticlesAdapter

/**
 * Describes all the events originated from
 * [NewsArticlesAdapter].
 */
sealed class NewsAdapterEvent {

    /* Describes item click event  */
    object ClickEvent : NewsAdapterEvent()
}