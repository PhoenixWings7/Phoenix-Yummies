package com.phoenixwings7.phoenixyummies.localdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity(tableName = "instructions")
public class RecipeInstructionPart extends com.phoenixwings7.phoenixyummies.spoonacularapi.RecipeInstructionPart {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "recipe_id")
    private int recipeID;
    @Relation(parentColumn = "recipe_id", entityColumn = "recipe_id")
    private List<InstructionStep> instructions;

    public int getId() {
        return id;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public List<InstructionStep> getInstructions() {
        return instructions;
    }
}
