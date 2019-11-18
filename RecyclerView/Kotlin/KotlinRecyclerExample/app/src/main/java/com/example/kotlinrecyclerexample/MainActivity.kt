package com.example.kotlinrecyclerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animeList = mutableListOf<Anime>()

        animeList.add(Anime("Clannad", "Okazaki Tomoya"))
        animeList.add(Anime("Re: Zero kara Hajimeru Isekai Seikatsu", "Natsuki Subaru"))
        animeList.add(Anime("Boku no Hero Academia", "Midoriya Izuku"))

        val animeAdapter = AnimeAdapter(animeList)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = animeAdapter
    }
}
