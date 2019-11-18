package com.example.kotlinretrofitexample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitInitialization {

    val BASE_URL: String = "https://jsonplaceholder.typicode.com"

    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()



    fun theServices() = retrofit.create(RetrofitServices::class.java)

}