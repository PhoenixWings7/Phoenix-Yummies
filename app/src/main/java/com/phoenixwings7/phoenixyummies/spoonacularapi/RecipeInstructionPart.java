package com.phoenixwings7.phoenixyummies.spoonacularapi;

import androidx.room.Ignore;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * A breakdown of a recipe's instructions.
 */
public class RecipeInstructionPart {
    @SerializedName("name")
    private String title;

    @SerializedName("steps")
    @Ignore
    private List<InstructionStep> instructionSteps;

    public String getTitle() {
        return title;
    }

    public List<InstructionStep> getInstructionSteps() {
        return instructionSteps;
    }
}
