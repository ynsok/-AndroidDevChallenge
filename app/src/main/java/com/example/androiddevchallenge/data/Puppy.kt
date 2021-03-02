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
package com.example.androiddevchallenge.data

import android.os.Parcelable
import com.example.androiddevchallenge.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Puppy(val id: Int, val url: String, val description: Int = R.string.puppy_description) :
    Parcelable

val puppies = listOf<Puppy>(
    Puppy(
        id = 0,
        url = "https://images.pexels.com/photos/3726314/pexels-photo-3726314.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940",
    ),
    Puppy(
        id = 1,
        url = "https://images.pexels.com/photos/4148012/pexels-photo-4148012.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260",
    ),
    Puppy(
        id = 2,
        url = "https://images.pexels.com/photos/4490129/pexels-photo-4490129.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260",
    ),
    Puppy(
        id = 3,
        url = "https://images.pexels.com/photos/3888471/pexels-photo-3888471.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260",
    ),
    Puppy(
        id = 4,
        url = "https://images.pexels.com/photos/4587998/pexels-photo-4587998.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260",
    ),
    Puppy(
        id = 5,
        url = "https://images.pexels.com/photos/3908821/pexels-photo-3908821.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260",
    ),
    Puppy(
        id = 6,
        url = "https://images.pexels.com/photos/2523934/pexels-photo-2523934.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260",
    ),
    Puppy(
        id = 7,
        url = "https://images.pexels.com/photos/3198012/pexels-photo-3198012.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260",
    ),
    Puppy(
        id = 8,
        url = "https://images.pexels.com/photos/3478875/pexels-photo-3478875.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260",
    ),
    Puppy(
        id = 9,
        url = "https://images.pexels.com/photos/3198049/pexels-photo-3198049.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    ),
    Puppy(
        id = 10,
        url = "https://images.pexels.com/photos/1718181/pexels-photo-1718181.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
    )
)
