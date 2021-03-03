package com.example.androiddevchallenge.data

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.example.androiddevchallenge.R

class SampleDogProvider: PreviewParameterProvider<Dog> {
    override val values = sequenceOf(
        Dog("id1", "Dog name", "Dog desc", R.drawable.dog1, true),
        Dog("id2", "Dog 3 name", "dog desc", R.drawable.dog1, false)
    )
    override val count = values.count()
}