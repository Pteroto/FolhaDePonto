package com.doubleg.folhadeponto.room

import androidx.room.*
import com.doubleg.folhadeponto.model.User

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    suspend fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE id = (:userId)")
    suspend fun getById(userId: Int): User

    @Query("SELECT * FROM user WHERE name LIKE '%' || (:userName) || '%'")
    suspend fun getByName(userName: String): List<User>

    @Insert
    fun insertUser(user: User)

    @Delete
    fun delete(user: User)

    @Update
    fun update(user: User)
}