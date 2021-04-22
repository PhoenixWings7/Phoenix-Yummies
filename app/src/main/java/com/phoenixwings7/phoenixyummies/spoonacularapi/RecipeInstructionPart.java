package com.phoenixwings7.phoenixyummies.spoonacularapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecipeInstructionPart {
    @SerializedName("name")
    private String instructionPartTitle;
    @SerializedName("steps")
    private List<InstructionStep> instructionSteps;

    public String getInstructionPartTitle() {
        return instructionPartTitle;
    }

    public List<InstructionStep> getInstructionSteps() {
        return instructionSteps;
    }
}
