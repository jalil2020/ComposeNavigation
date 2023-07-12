package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composenavigation.Screens
import com.example.composenavigation.screen.FavoriteScreen
import com.example.composenavigation.screen.IntegroScreen
import com.example.composenavigation.screen.MainContainer
import com.example.composenavigation.screen.ProfileScreen
import com.example.composenavigation.screen.TableScreen
import com.example.composenavigation.splash.SplashScreen


@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.SplashScreen.route) {
        composable(Screens.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screens.IntegroScreen.route) {
            IntegroScreen(navController)
        }
        composable(Screens.MainContainerScreen.route) {
            MainContainer(navController = navController)
        }
        composable(BottomNavItem.TableScreen.screen_route) {
            TableScreen()
        }
        composable(BottomNavItem.FavoriteScreen.screen_route) {
            FavoriteScreen()
        }
        composable(BottomNavItem.ProfileScreen.screen_route) {
            ProfileScreen()
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val AUTH = "auth_graph"
    const val MAIN = "main_graph"
}
