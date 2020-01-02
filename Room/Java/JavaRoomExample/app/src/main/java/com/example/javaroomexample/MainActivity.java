package com.example.javaroomexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AnimeDao animeDao;

    EditText enterNome, enterProtagonista, enterPos;
    TextView animeShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterNome = findViewById(R.id.enterNomeAnime);
        enterProtagonista = findViewById(R.id.enterProtagonista);
        enterPos = findViewById(R.id.enterSearchPos);

        animeShow = findViewById(R.id.animeShow);

        animeDao = Room.databaseBuilder(this, AnimeDatabase.class, "animeDatabase.db")
                .allowMainThreadQueries()
                .build()
                .animeDao();
    }

    public void cadastrar(View view) {

        animeDao.insert(

                new Anime(enterNome.getText().toString(), enterProtagonista.getText().toString())

        );

    }

    public void mostrarAnime(View view) {

        if(!enterPos.getText().toString().equals("")){

            String toAppend = "";

            toAppend += "Nome: ";

        }

    }
}
