package com.example.composenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.MainScreen.route) {

        composable(route = Screens.MainScreen.route) {
            MainScreen(navController = navController)
        }

        composable(
            route = Screens.FirstScreen.route + "/?name={name}",
            arguments = listOf(navArgument("name") {
                type = NavType.StringType
                defaultValue = "Jalil"
                nullable = true
            })
        ) { entry ->
            FirstScreen(entry.arguments?.getString("name"))

        }
    }
}