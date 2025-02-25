package com.example.logincompose.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.logincompose.Login
import com.example.logincompose.R

@Composable
fun WelcomeScreen (
    navController: NavController
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    )   {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher),
                contentDescription = stringResource(id = R.string.app_name),
                modifier =  Modifier
                    .size(150.dp)
                )
            Text(
            "Bạn đã sẵn sàng khám phá phiên bản khỏe mạnh nhất của mình chưa?",
                Modifier.padding(15.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
            "Đăng nhập ngay để bắt đầu hành trình cải thiện sức khỏe cùng chúng tôi.",
                Modifier.padding(15.dp),
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )

        Button(
            onClick = {
                navController.navigate(Login)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            Text("Bắt đầu nào")
        }

        }
}

