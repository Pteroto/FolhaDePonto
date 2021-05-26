package com.doubleg.folhadeponto

import android.app.Application
import com.doubleg.folhadeponto.room.Database

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Database.initDatabase(this)
    }
}