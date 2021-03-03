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
package com.example.androiddevchallenge.ui.home

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.DetailActivity
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.Dogabase
import com.example.androiddevchallenge.data.SampleDogProvider

@Composable
fun Home(context: Context) {
    LazyColumn() {
        item {
            Text("Snakes are actually dogs here")

            Dogabase.getDogs().forEach {
                val dog = Dogabase.getDog(it)

                Button(
                    onClick = {
                        Intent(context, DetailActivity::class.java).apply {
                            putExtra("dogId", dog.id)
                            context.startActivity(this)
                        }
                    }
                ) {
                    DogCard(dog)
                }
            }
        }
    }
}

@Preview
@Composable()
fun DogCard(@PreviewParameter(SampleDogProvider::class) dog: Dog) {
    Image(
        painter = painterResource(dog.image),
        contentDescription = null,
        modifier = Modifier
            .height(150.dp)
            .width(150.dp)
    )
    Text(dog.name)
}
