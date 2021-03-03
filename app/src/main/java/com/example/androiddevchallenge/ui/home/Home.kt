package com.example.androiddevchallenge.ui.home

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.Dogabase
import com.example.androiddevchallenge.data.SampleDogProvider

@Composable
fun Home(context: Context) {
    LazyColumn() {
        item {
            Text("Snakes are actually dogs here")

            listOf("dog1", "dog2").forEach {
                val dog = Dogabase.getDog(it)

                Button(onClick = {
                    Intent("DetailActivity").apply {
                        putExtra("dogId", dog.id)
                        context.startActivity(this)
                    }
                }) {
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