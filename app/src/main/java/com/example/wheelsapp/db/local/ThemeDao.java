package com.example.wheelsapp.db.local;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.wheelsapp.models.Theme;

@Dao
public interface ThemeDao {

    @Query("SELECT * from theme where id=1")
    LiveData<Theme> getTheme();

    @Query("SELECT * from theme where id=1")
    Theme getThemeSingleValue();

    @Query("UPDATE theme SET color =:color WHERE id=1")
    void updateTheme(int color);

    @Insert
    void insertTheme(Theme theme);
}
