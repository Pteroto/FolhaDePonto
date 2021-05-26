package com.doubleg.folhadeponto.room

import androidx.room.Dao
import androidx.room.Query

@Dao
interface TimeSheetDao {

    @Query("SELECT * FROM TIMESHEET")
    suspend fun getTimeSheetByName(userName: String)
}