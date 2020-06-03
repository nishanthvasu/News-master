package com.nishanth.newsapp.core.di

import androidx.lifecycle.ViewModelProvider
import com.nishanth.newsapp.core.di.base.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
interface ViewModelFactoryModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}