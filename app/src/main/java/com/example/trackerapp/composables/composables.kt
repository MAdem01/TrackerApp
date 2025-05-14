package com.example.trackerapp.composables

import androidx.compose.material3.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun CustomBottomAppBar(){
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = Color(0xFF0d0e14)
    )

    BottomAppBar(
        containerColor = Color(0xFF0d0e14)
    ) {
    }
}