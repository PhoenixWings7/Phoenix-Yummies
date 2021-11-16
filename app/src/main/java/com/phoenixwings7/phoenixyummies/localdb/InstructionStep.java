package com.phoenixwings7.phoenixyummies.localdb;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "instruction_steps",
        foreignKeys = {@ForeignKey(entity = Recipe.class, parentColumns = {"id"},
                childColumns = {"recipe_id"}, onDelete = CASCADE, onUpdate = CASCADE)})
public class InstructionStep {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "recipe_id")
    private int recipeID;

    public int getId() {
        return id;
    }

    @ColumnInfo(name = "step_number")
    private int number;

    private String text;

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }
}
