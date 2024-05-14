package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.plasmalink.ui.theme.screens.home.HomeScreen
import com.example.plasmalink.ui.theme.screens.splashscreen.splashscreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddDetailsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewDetailsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(ROUT_LOGIN){
            LoginScreen(navController = navController)
        }
        composable(ROUT_SIGNUP){
            SignupScreen(navController = navController)
        }
        composable(ROUT_HOME){
            HomeScreen(navController = navController)
        }
        composable(ROUT_ADD_PRODUCT){
            AddProductsScreen(navController = navController)
        }
        composable(ROUT_VIEW_PRODUCT){
            ViewProductsScreen(navController = navController)
        }

        composable(ROUT_SPLASH){
            splashscreen(navController = navController)
        }

        composable(ROUT_ADD_DETAILS){
            AddDetailsScreen(navController = navController)
        }
        composable(ROUT_VIEW_DETAILS){
            ViewDetailsScreen(navController = navController)
        }

        composable(ROUT_ADMIN){
            ViewDetailsScreen(navController = navController)
        }



    }
}