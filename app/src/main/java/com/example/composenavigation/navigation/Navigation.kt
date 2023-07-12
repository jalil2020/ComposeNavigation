package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composenavigation.screen.MainContainer


@Composable
fun RootNavigationGraph(navController: NavHostController) {
    NavHost(
        route = Graph.ROOT,
        navController = navController,
        startDestination = Graph.SPLASH
    ) {
        splashNavGraph(navController)
        composable(route = Graph.MAIN) {
            MainContainer()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val SPLASH = "splash_graph"
    const val AUTH = "auth_graph"
    const val MAIN = "main_graph"
    const val HOME = "home_graph"
}
