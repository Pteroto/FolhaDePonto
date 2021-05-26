package com.doubleg.folhadeponto.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.doubleg.folhadeponto.model.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
//    abstract fun timeSheetDao(): TimeSheetDao
}