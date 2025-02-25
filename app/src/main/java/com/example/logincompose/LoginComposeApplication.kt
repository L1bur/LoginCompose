package com.example.logincompose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LoginComposeApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}