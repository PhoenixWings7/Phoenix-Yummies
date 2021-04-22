package com.phoenixwings7.phoenixyummies.spoonacularapi;

import com.google.gson.annotations.SerializedName;

public class InstructionStep {
    private int number;
    @SerializedName("step")
    private String text;

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }
}
