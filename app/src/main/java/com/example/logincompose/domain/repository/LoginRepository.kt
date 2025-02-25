package com.example.logincompose.domain.repository

import com.example.logincompose.domain.entity.User

interface LoginRepository {

    suspend fun getUsers(): Result<List<User>>

    suspend fun login(username: String, password: String) : Result<Any>
}