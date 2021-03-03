package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.Dogabase
import com.example.androiddevchallenge.ui.detail.Detail
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                val dogId = intent.getSerializableExtra("dogId") as? String ?: return@MyTheme
                Detail(Dogabase.getDog(dogId))
            }
        }
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DetailPreview() {
    MyTheme(darkTheme = true) {
        Detail(Dogabase.getDog("dog1"))
    }
}