package com.phoenixwings7.phoenixyummies.spoonacularapi;

import com.google.gson.annotations.SerializedName;

/**
 * An instruction step of a recipe's instructions.
 */
public class InstructionStep {
    @SerializedName("number")
    private int stepNumber;

    @SerializedName("step")
    private String text;

    public int getStepNumber() {
        return stepNumber;
    }

    public String getText() {
        return text;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public void setText(String text) {
        this.text = text;
    }
}
