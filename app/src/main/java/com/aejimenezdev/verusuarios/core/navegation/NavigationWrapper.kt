package com.aejimenezdev.verusuarios.core.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aejimenezdev.verusuarios.HomeScreen
import com.aejimenezdev.verusuarios.UsersScreen
import kotlinx.serialization.Serializable



@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Home) {
        composable<Home> {
            HomeScreen { navController.navigate(Users)}
        }

        composable<Users> {
            UsersScreen()
        }

    }
}