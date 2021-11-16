package com.phoenixwings7.phoenixyummies.localdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "instructions")
// TODO: Entities cannot have relations => no extending classes
public class RecipeInstructionPart {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "recipe_id")
    private int recipeID;
    private String title;
    // @Relation(parentColumn = "recipe_id", entityColumn = "recipe_id")
    // private List<InstructionStep> instructions;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
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
