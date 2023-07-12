package com.example.composenavigation

sealed class Screens(val route: String) {

    object SplashScreen : Screens("splash_screen")
    object IntegroScreen : Screens("integro_screen")

    object MainContainerScreen : Screens("main_container")

    object Auth {
        object LoginScreen : Screens("login_screen")
        object SignUpScreen : Screens("sign_up_screen")
        object SmsVerificationScreen : Screens("sms_verification_screen")
    }

    object Main : Screens("main_screen") {
        object HomeScreen : Screens("home_screen")
        object TableScreen : Screens("table_screen")
        object FavoriteScreen : Screens("favorite_screen")
        object ProfileScreen : Screens("favorite_screen")
    }

    object Med {
        object SubServiceScreen : Screens("med_sub_service_screen")
        object ServiceInfoScreen : Screens("med_service_info_screen")
    }

    object Auto {
        object SubServiceScreen : Screens("auto_sub_service_screen")
        object ServiceInfoScreen : Screens("auto_service_info_screen")
    }

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.onEach { arg ->
                append("/$arg")
            }
        }
    }
}
