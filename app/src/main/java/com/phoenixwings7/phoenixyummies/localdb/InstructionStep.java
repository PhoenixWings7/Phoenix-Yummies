package com.phoenixwings7.phoenixyummies.localdb;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "instruction_steps",
        foreignKeys = {@ForeignKey(entity = Recipe.class, parentColumns = {"id"},
                childColumns = {"recipe_id"}, onDelete = CASCADE, onUpdate = CASCADE)})
public class InstructionStep extends com.phoenixwings7.phoenixyummies.spoonacularapi.InstructionStep {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "recipe_id")
    private int recipeID;

    public int getId() {
        return id;
    }

    public int getRecipeID() {
        return recipeID;
    }
}
