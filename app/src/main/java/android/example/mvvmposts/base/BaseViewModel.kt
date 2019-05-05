package android.example.mvvmposts.base

import android.arch.lifecycle.ViewModel
import android.example.mvvmposts.injection.DaggerViewModelInjector
import android.example.mvvmposts.injection.ViewModelInjector
import android.example.mvvmposts.injection.module.NetworkModule
import android.example.mvvmposts.ui.post.PostListViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when(this) {
            is PostListViewModel -> injector.inject(this)
        }
    }

}