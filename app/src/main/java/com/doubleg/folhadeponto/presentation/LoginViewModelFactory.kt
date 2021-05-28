package com.doubleg.folhadeponto.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.doubleg.folhadeponto.domain.UserUseCase
import com.doubleg.folhadeponto.room.Database

@Suppress("UNCHECKED_CAST")
class LoginViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val database = Database.database
        val userUseCase = UserUseCase(database.userDao())
        return LoginViewModel(userUseCase) as T
    }
}