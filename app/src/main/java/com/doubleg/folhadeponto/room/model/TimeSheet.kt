package com.doubleg.folhadeponto.room.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class TimeSheet(
    @PrimaryKey val id: Int,
    val user: User,
    val time: Date
)
