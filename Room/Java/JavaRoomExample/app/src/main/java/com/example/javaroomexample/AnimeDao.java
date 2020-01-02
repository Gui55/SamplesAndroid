package com.example.javaroomexample;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface AnimeDao {

    @Insert
    public void insert(Anime... anime);

    @Delete
    public void delete(Anime anime);

    @Query("SELECT * FROM anime")
    public void getAnimes();

}
