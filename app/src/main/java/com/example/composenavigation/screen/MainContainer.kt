package com.example.composenavigation.screen

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.Screens
import com.example.composenavigation.navigation.BottomNavItem
import com.example.composenavigation.navigation.MainGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContainer(navController: NavHostController = rememberNavController()) {

    val items = arrayListOf(
        BottomNavItem.HomeScreen,
        BottomNavItem.TableScreen,
        BottomNavItem.FavoriteScreen,
        BottomNavItem.ProfileScreen,
    )

    val isVisableButtomBar = remember {
        mutableStateOf(true)
    }
    navController.addOnDestinationChangedListener { _, destination, _ ->
        isVisableButtomBar.value = items.find { it.screen_route == destination.route } != null
    }

    Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = {
        if (isVisableButtomBar.value) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .background(Color.Green),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                items.onEach { screen ->
                    val selected =
                        currentDestination?.hierarchy?.any() { it.route == screen.screen_route } == true
                    Image(
                        modifier = Modifier
                            .weight(1f, true)
                            .clip(CircleShape)
                            .scale(if (selected) 1.5f else 1f)
                            .background(color = if (selected) Color.Red else Color.Transparent)
                            .clickable {
                                navController.navigate(screen.screen_route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                        painter = painterResource(id = screen.icon),
                        contentDescription = null
                    )
                }
            }
        }
    }) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(innerPadding)
        ) {
            /* NavHost(navController = navController, startDestination = Screens.Main.HomeScreen.route){
                 composable(route = Screens.Main.HomeScreen.route){
                     HomeScreen()
                 }
             }*/
            MainGraph(navController = navController)
        }
    }

}