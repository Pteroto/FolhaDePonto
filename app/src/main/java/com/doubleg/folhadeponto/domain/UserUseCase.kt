package com.doubleg.folhadeponto.domain

import com.doubleg.folhadeponto.room.model.User
import com.doubleg.folhadeponto.room.UserDao

class UserUseCase(private val userDao: UserDao) {

    suspend fun getUsers(): List<User> {
        return userDao.getAll()
    }

}