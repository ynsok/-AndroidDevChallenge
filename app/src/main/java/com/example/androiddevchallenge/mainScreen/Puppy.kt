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
package com.example.androiddevchallenge.mainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.loadImage

@Composable
fun puppyImageLoader(puppy: Puppy, modifier: Modifier, selectPuppy: (Puppy) -> Unit) {
    loadImage(
        data = puppy.url,
        showComposable = {
            PuppyImage(
                image = it,
                modifier = modifier,
                onClick = { selectPuppy(puppy) }
            )
        }
    )
}

@Composable
fun PuppyImage(image: Painter, modifier: Modifier, onClick: () -> Unit) =
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .aspectRatio(0.6f, true)
            .clip(AbsoluteRoundedCornerShape(6.dp))
            .clickable { onClick.invoke() },
        contentScale = ContentScale.Crop
    )
