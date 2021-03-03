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
            return DOGABASE[dogId]
                ?: Dog("id", "Placeholder!", "no more dogs :(", R.drawable.ic_launcher_background, false)
        }
    }
}
