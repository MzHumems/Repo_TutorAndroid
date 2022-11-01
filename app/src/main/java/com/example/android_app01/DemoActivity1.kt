package com.example.android_app01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val Pinky = 0xffa6ffac

class DemoActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
            ) {
                Surface(
                    color = Color.Black,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Good Mowning",
                        fontSize = 25.sp,
                        modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 0.dp),
                        color = Color(Pinky),
                        textAlign = TextAlign.Center
                    )
                }
                Surface (
                    color = Color.Red,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "time to take a bath",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp),
                        color = Color.Cyan,
                        textAlign = TextAlign.Center
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.air),
                    contentDescription = "air = cai"
                )
            }
        }
    }
}