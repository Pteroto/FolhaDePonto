package com.doubleg.folhadeponto.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val password: String
) {
    constructor(name: String, password: String) : this(0, name, password)
}