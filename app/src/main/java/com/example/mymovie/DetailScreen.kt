package com.example.mymovie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Detail") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(20.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avengers_endgame_poster),
                    contentDescription = null,
                    modifier = Modifier.size(300.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "Avengers: Endgame", fontSize = 28.sp, fontWeight = FontWeight.Bold)

                Text(text = "2019")

                Text(text = "Action, Adventure, Drama")

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Sinopsis", fontSize = 20.sp,
                    modifier = Modifier.align(Alignment.Start)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Di tahun 2018 atau lebih spesifiknya 23 hari setelah Thanos " +
                            "melenyepkan hampir setengah penduduk bumi, anggota Avengers bersama " +
                            "Rocket Raccoon (Bradley Cooper) dan Carol Danvers aka Captain Marvel " +
                            "(Brie Lasrson), memutuskan untuk mencari Thanos.", fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Tujuannya adalah untuk mengambil kembali seluruh Infinity Stones," +
                            " lalu mengembalikan semuanya seperti semula alias mengembalikan " +
                            "setengah penduduk bumi yang terkena Thanos Blip tersebut.", fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Mereka berhasil menemukan The Mad Titan. Namun sayangnya ketika " +
                            "mengkonfrontasi villain berwarna ungu tersebut, mereka kaget ketika " +
                            "mendengar kalau Thanos telah menghancurkan seluruh Infinity Stones-nya. " +
                            "Thor (Chris Hemsworth) yang merasa geram banget langsung memenggal " +
                            "kepala Thanos.", fontSize = 16.sp
                )
            }
        }
    )
}