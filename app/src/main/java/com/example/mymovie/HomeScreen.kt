package com.example.mymovie

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    val movies = listOf(
        Movie("Avengers: Endgame", R.drawable.avengers_endgame_poster),
        Movie("Avengers: Infinity War", R.drawable.avengers_infinity_war),
        Movie("Avengers: Age of Ultron", R.drawable.avengers_age_of_ultron),
        Movie("The Avengers", R.drawable.the_avengers),
        Movie("Captain America: Civil War", R.drawable.captain_america_civil_war),
        Movie("Iron Man 3", R.drawable.iron_man_3),
        Movie("Thor: The Dark World", R.drawable.thor_dark_world),
        Movie("Guardians of the Galaxy Vol. 2", R.drawable.gotg2),
        Movie("Ant-Man and the Wasp: Quantumania", R.drawable.antman_thewasp_quantumania),
        Movie("Captain Marvel", R.drawable.captain_marvel),
        Movie("Avengers: Endgame", R.drawable.avengers_endgame_poster)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(movies) { movie ->
                Row(
                    modifier = Modifier
                        .clickable {
                            if (movie.title == "Avengers: Endgame") {
                                navController.navigate("detail")
                            }
                        }
                        .padding(5.dp)
                ) {
                    Image(
                        painter = painterResource(id = movie.posterResId),
                        contentDescription = movie.title,
                        modifier = Modifier.size(50.dp)
                    )
                    Text(
                        text = movie.title,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }
        }
    }
}

data class Movie(val title: String, val posterResId: Int)