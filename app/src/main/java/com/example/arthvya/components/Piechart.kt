package com.example.arthvya.components

import androidx.compose.runtime.Composable

@Composable
fun Piechart()
{
    var data:Map<String,Int> = mapOf(
        Pair("Food",550),
        Pair("Travel",100),
        Pair("Grocery",1200),
        Pair("Gift",500)
    )
    var total = data.values.sum()

    val floatValue = mutableListOf<Float>()

    
}