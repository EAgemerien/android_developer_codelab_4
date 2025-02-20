package com.example.bussinescardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
        }
    }
}

@Composable
fun BusinessCardApp(){
    Column(
        modifier = Modifier
            .background(color = Color.Gray)
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
             modifier = Modifier
                 .size(150.dp)
                 .background(color = Color.DarkGray),
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null
            )
            Text(
                text = "Emmanuel Agemerien",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Android Developer Extraordinaire")
        }

        Column(
            verticalArrangement = Arrangement.Bottom,

            
        ) {
            Row {
                Icon(painter = painterResource(id = R.drawable.icon_call_24), contentDescription = null)
                Text(text = " +234 (0) 8061773131")
            }
            Row {
                Icon(painter = painterResource(id = R.drawable.icon_share_24), contentDescription = null)
                Text(text = " @vhalz")
            }
            Row {
                Icon(painter = painterResource(id = R.drawable.icon_mail_24), contentDescription = null)
                Text(text = " @emmanuelagemerien10@gmail.com")
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BusinessCardAppPreview() {
        BusinessCardApp()
}