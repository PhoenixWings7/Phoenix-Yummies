package com.phoenixwings7.phoenixyummies.spoonacularapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * A breakdown of a recipe's instructions.
 */
public class RecipeInstructionPart {
    @SerializedName("name")
    private String title;

    @SerializedName("steps")
    private List<InstructionStep> instructionSteps;

    public String getTitle() {
        return title;
    }

    public List<InstructionStep> getInstructionSteps() {
        return instructionSteps;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInstructionSteps(List<InstructionStep> instructionSteps) {
        this.instructionSteps = instructionSteps;
    }
}
