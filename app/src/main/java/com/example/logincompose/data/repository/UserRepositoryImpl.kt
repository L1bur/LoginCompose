package com.example.logincompose.data.repository

import com.example.logincompose.data.remote.api.UserApi
import com.example.logincompose.data.remote.request.LoginRequest
import com.example.logincompose.domain.entity.User
import com.example.logincompose.domain.repository.LoginRepository
import jakarta.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRepositoryImpl @Inject constructor(
    private val userApi: UserApi,
) : LoginRepository {

    override suspend fun getUsers(): Result<List<User>> {
        return try {
            val users = userApi.getUsers()
            Result.success(users)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    override suspend fun login(username: String, password: String): Result<Any> {
        return try{
            val loginRequest = LoginRequest(username,password)
            val response = userApi.login(loginRequest)
            Result.success(response)
        }catch (e: Exception){
            Result.failure(e)
        }
    }
}