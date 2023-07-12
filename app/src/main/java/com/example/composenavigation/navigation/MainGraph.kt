package com.example.composenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composenavigation.Screens
import com.example.composenavigation.screen.FavoriteScreen
import com.example.composenavigation.screen.HomeScreen
import com.example.composenavigation.screen.IntegroScreen
import com.example.composenavigation.screen.MainContainer
import com.example.composenavigation.screen.ProfileScreen
import com.example.composenavigation.screen.TableScreen
import com.example.composenavigation.splash.SplashScreen
import kotlinx.coroutines.MainScope


@Composable
fun MainGraph(navController: NavHostController) {
    NavHost(
        route = Graph.MAIN,
        navController = navController,
        startDestination = Screens.Main.HomeScreen.route
    ) {
        composable(BottomNavItem.HomeScreen.screen_route) {
            HomeScreen()
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