package com.example.logincompose.presentation

import androidx.lifecycle.ViewModel
import com.example.logincompose.domain.entity.User
import com.example.logincompose.domain.repository.LoginRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginRepository: LoginRepository
) : ViewModel() {

    private val _username =MutableStateFlow("")
    val username =_username.asStateFlow()

    private val _password =MutableStateFlow("")
    val password =_password.asStateFlow()


    fun setUsername(username: String){
        _username.value = username
    }
    fun setPassword(password: String){
        _password.value = password
    }

    suspend fun login(){
        loginRepository.login(username.value, password.value)
    }
}