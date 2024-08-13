package com.forest.kmm_clean_architecture.android.di

import com.forest.kmm_clean_architecture.article.presentation.ArticlesViewModel
import com.forest.kmm_clean_architecture.photo.presentation.PhotosViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { ArticlesViewModel(get()) }
    viewModel { PhotosViewModel(get()) }
}