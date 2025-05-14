package com.example.trackerapp.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trackerapp.R
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun CustomBottomAppBar(calorieIconColor: Color, workoutIconColor: Color, accountIconColor: Color){
    val systemUiController = rememberSystemUiController()
    systemUiController.setSystemBarsColor(
        color = Color(0xFF0d0e14)
    )

    BottomAppBar(
        modifier = Modifier.height(80.dp),
        containerColor = Color(0xFF0d0e14)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            BottomAppBarIcon(color = calorieIconColor, icon = R.drawable.calorie_screen_icon, description = "Macros")
            Spacer(modifier = Modifier.width(100.dp))
            BottomAppBarIcon(color = workoutIconColor, icon = R.drawable.workout_screen_icon, description = "Workouts")
            Spacer(modifier = Modifier.width(100.dp))
            BottomAppBarIcon(color = accountIconColor, icon = R.drawable.account_screen_icon, description = "Account")
        }
    }
}

@Composable
fun BottomAppBarIcon(color: Color, icon: Int, description: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = "Icon",
            modifier = Modifier.size(25.dp),
            tint = color)
        Text(
            text = description,
            color = color,
            fontSize = 7.sp
        )
    }
}