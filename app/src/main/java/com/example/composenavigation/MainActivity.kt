package com.example.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.navigation.RootNavigationGraph
import com.example.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()

                RootNavigationGraph(navController = navController)

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