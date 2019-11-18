package com.example.kotlinretrofitexample

import com.google.gson.annotations.SerializedName

//IMPORTANTE: No Kotlin, getters e setters são definidos implicitamente pelo construtor

//Essa classe possui apenas o construtor
data class User(

    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String

)