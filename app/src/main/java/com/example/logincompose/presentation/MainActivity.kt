package com.example.logincompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.logincompose.Login
import com.example.logincompose.Welcome
import com.example.logincompose.ui.theme.LoginComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.decorView
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            LoginComposeTheme {
                val navController = rememberNavController()
                Scaffold(
                    containerColor = Color.White,
                    modifier = Modifier
                        .navigationBarsPadding()
                        .imePadding()
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Welcome,
                        modifier = Modifier.padding(it)
                    ) {
                        composable<Welcome> {
                            WelcomeScreen(navController)
                        }
                        composable<Login> {
                            LoginScreen()
                        }
                    }
                }
            }
        }
    }
}



