package com.example.kotlinretrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val call = RetrofitInitialization().theServices().getUsers()

        call.enqueue(object : Callback<List<User>>{
            override fun onFailure(call: Call<List<User>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {

                var users : List<User>? = response.body()

                for(user in users!!){

                    var textToAppend : String = ""

                    textToAppend += "userId: " + user.userId + "\n"
                    textToAppend += "Id: " + user.id + "\n"
                    textToAppend += "Title: " + user.title + "\n"
                    textToAppend += "Text: " + user.body + "\n"
                    textToAppend += "\n"

                    thetext.append(textToAppend)

                }

            }


        })
    }
}
