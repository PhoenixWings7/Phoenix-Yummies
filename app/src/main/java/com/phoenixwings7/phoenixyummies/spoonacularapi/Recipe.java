package com.phoenixwings7.phoenixyummies.spoonacularapi;

import androidx.room.ColumnInfo;

import com.google.gson.annotations.SerializedName;

public class Recipe {
    @SerializedName("id")
    @ColumnInfo(name = "spooncular_id")
    private long recipeId;
    private String title;
    private String image;

    public long getRecipeId() {
        return recipeId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }
}
