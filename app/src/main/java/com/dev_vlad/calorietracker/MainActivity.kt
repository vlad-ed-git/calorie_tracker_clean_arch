package com.dev_vlad.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.dev_vlad.core_ui.theme.coreTheme
import com.dev_vlad.onboarding_presentation.welcome_screen.welcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            coreTheme {
                welcomeScreen()
            }
        }
    }
}
