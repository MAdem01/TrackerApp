package com.example.trackerapp.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.trackerapp.composables.CustomBottomAppBar

@Composable
fun CalorieScreen(){
    Scaffold(
        bottomBar = { CustomBottomAppBar() },
    ) { paddingValues ->
    }
}