package com.example.tipcard

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun TipCard1(){
Card(
    backgroundColor = Color(0xFF263238), modifier = Modifier.padding(16.dp)) {
    Text("Hello, Compose!")
}}