package com.example.androiddevchallenge.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Dog

@Composable
fun Detail(dog: Dog) {
    Column {
        Image(
            painter = painterResource(dog.image),
            contentDescription = null,
        )
        Text(dog.name)
        Text(dog.desc)
    }
}