package com.example.retrofitnewexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitServices {

    @GET("/posts")
    Call<List<User>> getUsers();

}
