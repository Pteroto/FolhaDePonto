package com.doubleg.folhadeponto.room.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["name"], unique = true)])
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val password: String
) {
    constructor(name: String, password: String) : this(0, name, password)
}