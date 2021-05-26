package com.doubleg.folhadeponto.room

import android.content.Context
import androidx.room.Room

object Database {

    lateinit var database: AppDatabase

    fun initDatabase(applicationContext: Context) {
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database"
        ).build()
    }
}