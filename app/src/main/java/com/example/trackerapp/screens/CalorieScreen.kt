package com.example.trackerapp.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.trackerapp.composables.CustomBottomAppBar

@Composable
fun CalorieScreen(){
    Scaffold(
        bottomBar = { CustomBottomAppBar(
            calorieIconColor = Color.White,
            workoutIconColor = Color.LightGray,
            accountIconColor = Color.LightGray
        ) },
    ) { paddingValues ->
    }
}