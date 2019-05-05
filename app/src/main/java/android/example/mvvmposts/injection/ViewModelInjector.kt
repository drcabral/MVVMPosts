package android.example.mvvmposts.injection

import android.example.mvvmposts.injection.module.NetworkModule
import android.example.mvvmposts.ui.post.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {

        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder

    }

}