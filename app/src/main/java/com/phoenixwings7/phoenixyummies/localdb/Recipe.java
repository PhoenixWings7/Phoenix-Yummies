package com.phoenixwings7.phoenixyummies.localdb;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "recipes")
public class Recipe extends com.phoenixwings7.phoenixyummies.spoonacularapi.Recipe {
    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }
}
