package com.example.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.navigation.BottomNavItem
import com.example.composenavigation.navigation.NavigationGraph
import com.example.composenavigation.splash.SplashScreen
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()

                NavigationGraph(navController = navController)

//                SplashScreen(navController = navController)

             /*   Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = {
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
                }) { innerPadding ->
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(innerPadding)
                    ) {

                    }
                    NavigationGraph(navController = navController)
                }*/
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeNavigationTheme {
        Greeting("Android")
    }
}