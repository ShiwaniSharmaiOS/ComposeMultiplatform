package com.example.compossecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.compossecourseyt.ui.theme.ComposseCourseYTTheme
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposseCourseYTTheme  {
Column {
    Column(
        modifier = Modifier
           // .fillMaxSize(0.5f)
            //.width(300.dp)
       //     .requiredWidth(600.dp)
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("hhiiii")
        Text("ganpati")
        Text("ganpati")
    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("hhiiii")
        Text("ganpati")
        Text("ganpati")
    }
}
            }
        }
    }
}

