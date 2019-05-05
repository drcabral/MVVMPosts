package android.example.mvvmposts.network

import android.example.mvvmposts.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>

}