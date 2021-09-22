package com.phoenixwings7.phoenixyummies.localdb;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ingredients")
public class Ingredient extends com.phoenixwings7.phoenixyummies.spoonacularapi.Ingredient {
    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }
}
