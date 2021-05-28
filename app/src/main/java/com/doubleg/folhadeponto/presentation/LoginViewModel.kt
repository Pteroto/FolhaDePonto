package com.doubleg.folhadeponto.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.doubleg.folhadeponto.domain.UserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(private val userUseCase: UserUseCase) : ViewModel() {

    private val _loginStatus: MutableLiveData<Boolean> = MutableLiveData()
    val loginStatus: LiveData<Boolean>
        get() = _loginStatus

    fun verifyLogin(login: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            var status = false
            val users = userUseCase.getUsers()

            users.forEach {
                if (it.name.contains(login) && it.password == password) {
                    status = true
                }
            }
            _loginStatus.postValue(status)
        }
    }
}