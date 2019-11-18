package com.example.kotlinretrofitexample

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices {

    @GET("posts")
    fun getUsers() : Call<List<User>>

}