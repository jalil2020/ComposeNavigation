package com.example.composenavigation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composenavigation.Screens
import com.example.composenavigation.screen.IntegroScreen
import com.example.composenavigation.screen.ProfileScreen
import com.example.composenavigation.splash.SplashScreen


fun NavGraphBuilder.splashNavGraph(navController: NavController) {
    navigation(route = Graph.SPLASH, startDestination = Screens.SplashScreen.route) {
        composable(Screens.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screens.IntegroScreen.route) {
            IntegroScreen(navController)
        }
    }
}