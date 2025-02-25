package com.example.logincompose.data.remote.api

import com.example.logincompose.data.remote.dto.UserDto
import com.example.logincompose.data.remote.request.LoginRequest
import com.example.logincompose.domain.entity.User
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface UserApi {
    @GET("users")
    suspend fun getUsers(): List<User>

    @POST("login")
    suspend fun login(
        @Body loginRequest:LoginRequest
    ):Any
}