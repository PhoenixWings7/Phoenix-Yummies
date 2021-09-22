package com.phoenixwings7.phoenixyummies.spoonacularapi;

import androidx.room.ColumnInfo;

import com.google.gson.annotations.SerializedName;

public class Ingredient {
    @SerializedName("id")
    @ColumnInfo(name = "spooncular_id")
    // it has to differ from "id" in localdb/Ingredient class that extends it
    private long ingredientId;

    private String name;
    private String unit;

    @ColumnInfo(name = "unit_short")
    private String unitShort;

    public long getIngredientId() {
        return ingredientId;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public String getUnitShort() {
        return unitShort;
    }
}
