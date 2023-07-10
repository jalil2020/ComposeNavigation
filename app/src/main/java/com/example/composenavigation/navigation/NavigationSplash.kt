package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.screen.MainScreen
import com.example.composenavigation.splash.SplashScreen

@Composable
fun NavigationSplash() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen") {

        composable(route = "splash_screen") {
            SplashScreen(navController)
        }
        composable(route = "main_screen") {
            MainScreen(navController = navController)
        }

    }
}