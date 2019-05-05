package android.example.mvvmposts.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.example.mvvmposts.model.Post
import android.example.mvvmposts.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun postDao(): PostDao
}