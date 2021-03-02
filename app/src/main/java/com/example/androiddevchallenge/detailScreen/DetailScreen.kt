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
package com.example.androiddevchallenge.detailScreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.loadImage

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun DetailScreen(upPress: () -> Unit, puppy: Puppy) {
    val state = rememberScrollState()
    Column {
        Card(modifier = Modifier.padding(16.dp), elevation = 8.dp) {
            Column {
                loadImage(data = puppy.url) {
                    DetailPuppyImage(painter = it, modifier = Modifier)
                }
                Spacer(modifier = Modifier.height(16.dp))
                Column(
                    Modifier
                        .padding(8.dp)
                        .height(200.dp)
                        .verticalScroll(state)
                ) {
                    Text(
                        LocalContext.current.getString(puppy.description),
                        fontSize = 20.sp
                    )
                }
            }
        }
        val showButton = state.maxValue - 60 < state.value
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(40.dp)
                .fillMaxWidth()
        ) {
            AnimatedVisibility(visible = showButton) {
                Button(onClick = upPress, Modifier.clip(CircleShape)) {

                    Image(
                        painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
                        contentDescription = null
                    )
                    Text(text = "Back")
                }
            }
        }
    }
}
