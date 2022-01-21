package com.squad.chemistry.utils

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavArgs
import androidx.navigation.NavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.squad.chemistry.screens.ElementDetails
import com.squad.chemistry.screens.HomeScreen
import com.squad.chemistry.utils.Screen
import com.squad.chemistry.viewModels.MainViewModel

@Composable
fun Navigation(context: Context, viewModel: MainViewModel) {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(context = context, navController = navController, viewModel = viewModel)
        }
        composable(
            route = Screen.ElementDetails.route + "/{index}",
            arguments = listOf(
                navArgument("index") {
                    type = NavType.IntType
                    defaultValue = 0
                    nullable = false
                }
            )
        ) { entry ->
            ElementDetails(
                context = context,
                navController = navController,
                viewModel = viewModel,
                index = entry.arguments!!.getInt("index")
            )

        }

    }

}