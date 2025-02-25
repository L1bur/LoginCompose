package com.example.logincompose.domain.entity

data class User(
    val id: Int,
    val username: String,
    val password: String,
    val name: String = ""
)
