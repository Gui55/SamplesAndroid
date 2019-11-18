package com.example.javarecyclerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView animeRecycle;
    List<Anime> animeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animeList = new ArrayList<>();

        animeList.add(new Anime("Clannad", "Okazaki Tomoya"));
        animeList.add(new Anime("Re: Zero kara Hajimeru Isekai Seikatsu", "Natsuki Subaru"));
        animeList.add(new Anime("Boku no Hero Academia", "Midoriya Izuku"));

        animeRecycle = (RecyclerView)findViewById(R.id.recycler);
        animeRecycle.setLayoutManager(new LinearLayoutManager(this));
        animeRecycle.setAdapter(new AnimeAdapter(animeList));

    }
}
