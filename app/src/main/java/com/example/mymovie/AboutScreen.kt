package com.example.mymovie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AboutScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.gambar_diri),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("Muhammad Fadly Multi")

        Spacer(modifier = Modifier.height(10.dp))

        Text("fadtia10@gmail.com")

        Spacer(modifier = Modifier.height(10.dp))

        Text("Universitas Pembangunan Nasional")

        Text("Veteran Jakarta")

        Spacer(modifier = Modifier.height(10.dp))

        Text("S1 Informatika")
    }
}