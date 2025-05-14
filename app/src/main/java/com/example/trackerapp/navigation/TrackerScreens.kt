package com.example.trackerapp.navigation

enum class TrackerScreens {
    CALORIE_SCREEN,
    WORKOUT_SCREEN,
    ACCOUNT_SCREEN;
    companion object{
        fun fromRoute(route: String?){
            when(route?.substringBefore("/")){
                CALORIE_SCREEN.name -> CALORIE_SCREEN
                WORKOUT_SCREEN.name -> WORKOUT_SCREEN
                ACCOUNT_SCREEN.name -> ACCOUNT_SCREEN
                null -> CALORIE_SCREEN
                else -> throw IllegalArgumentException("Route $route is not recognized")
            }
        }
    }
}