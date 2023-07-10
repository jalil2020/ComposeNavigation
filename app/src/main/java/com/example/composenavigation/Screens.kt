package com.example.composenavigation

sealed class Screens(val route: String) {
    object MainScreen : Screens("main_screen")
    object FirstScreen : Screens("first_screen")
    object SecondScreen : Screens("second_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.onEach { arg ->
                append("/$arg")
            }
        }
    }
}
