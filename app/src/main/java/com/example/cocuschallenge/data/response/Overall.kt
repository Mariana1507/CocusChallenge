package com.example.cocuschallenge.data.response


import com.google.gson.annotations.SerializedName

data class Overall(
    val rank: Int,
    val name: String,
    val color: String,
    val score: Int
)