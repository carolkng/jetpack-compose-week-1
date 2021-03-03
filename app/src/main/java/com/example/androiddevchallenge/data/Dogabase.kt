package com.example.androiddevchallenge.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.androiddevchallenge.R

class Dogabase {
    companion object {
        private val DOGABASE = mapOf(
            Pair("dog1", Dog("dog1", "Alpha", "A real good boy!", R.drawable.dog1, true)),
            Pair("dog2", Dog("dog2", "Beta", "A less good boy", R.drawable.dog2, false)),
            Pair("dog3", Dog("dog3", "Gamma", "A really long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long long boy", R.drawable.dog3, true)),
            Pair("dog4", Dog("dog4", "Delta", "A toiny boy", R.drawable.dog4, false)),
            Pair("dog5", Dog("dog5", "Eta", "A boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy who is a boy.", R.drawable.dog5, true))
        )

        fun getDog(dogId: String): Dog {
            return DOGABASE[dogId] ?:
                Dog("id", "Placeholder!", "no more dogs :(", R.drawable.ic_launcher_background, false)
        }
    }
}