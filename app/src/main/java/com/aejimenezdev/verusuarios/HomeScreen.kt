package com.aejimenezdev.verusuarios

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun HomeScreen(navigateToUser: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Bienvenido a la aplicación Ver Usuarios")
        Spacer(modifier = Modifier.weight(1f))
        Button( onClick = { navigateToUser() }) {
            Text(text = "Ver usuarios")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}