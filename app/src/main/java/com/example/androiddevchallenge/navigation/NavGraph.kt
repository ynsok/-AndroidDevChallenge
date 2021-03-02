/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.detailScreen.DetailScreen
import com.example.androiddevchallenge.mainScreen.MainScreen

@Composable
fun NavGraph(startDestination: String = Destinations.MAIN_ROUTE) {
    val navController = rememberNavController()
    val actions = remember(navController) { Actions(navController) }
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Destinations.MAIN_ROUTE) {
            MainScreen(actions.selectPuppy)
        }
        composable(
            Destinations.DETAIL_ROUTE,
            arguments =
            listOf(
                navArgument(Destinations.DETAIL_ARGUMENT_KEY) {
                    type = NavType.ParcelableType<Puppy>(Puppy::class.java)
                }
            )
        ) {
            val argument = requireNotNull(navController.previousBackStackEntry?.arguments)
            val puppy = requireNotNull(argument.getParcelable<Puppy>(Destinations.DETAIL_ARGUMENT_KEY))
            DetailScreen(actions.upPress, puppy)
        }
    }
}
