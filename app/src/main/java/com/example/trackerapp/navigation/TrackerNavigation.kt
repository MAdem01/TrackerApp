package com.example.trackerapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trackerapp.screens.CalorieScreen

@Composable
fun TrackerNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = TrackerScreens.CALORIE_SCREEN.name){
        composable(route = TrackerScreens.CALORIE_SCREEN.name){
            CalorieScreen()
        }
        composable(route = TrackerScreens.WORKOUT_SCREEN.name){

        }
        composable(route = TrackerScreens.ACCOUNT_SCREEN.name){

        }
    }
}