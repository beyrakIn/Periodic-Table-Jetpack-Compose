package com.squad.chemistry.utils

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object ElementDetails : Screen("element_details")
}
