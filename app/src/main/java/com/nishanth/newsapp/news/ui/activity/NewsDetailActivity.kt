package com.nishanth.newsapp.news.ui.activity

import android.os.Bundle
import com.nishanth.newsapp.R
import com.nishanth.newsapp.core.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_details.*

class NewsDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        webview_newsdetails.loadUrl("")
    }

}