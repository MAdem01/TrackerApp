package com.example.trackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.example.trackerapp.navigation.TrackerNavigation
import com.example.trackerapp.ui.theme.TrackerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp {
                TrackerNavigation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit){
    TrackerAppTheme {
        content()
    }
}

