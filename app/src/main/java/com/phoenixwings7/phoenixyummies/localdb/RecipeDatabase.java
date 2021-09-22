package com.phoenixwings7.phoenixyummies.localdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Recipe.class, RecipeInstructionPart.class, InstructionStep.class, Ingredient.class},
        version = 1)
public abstract class RecipeDatabase extends RoomDatabase {
    public abstract RecipeDAO getRecipeDAO();
}
