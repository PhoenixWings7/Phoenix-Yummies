package com.phoenixwings7.phoenixyummies.spoonacularapi;

import androidx.room.ColumnInfo;

import com.google.gson.annotations.SerializedName;

/**
 * An instruction step of a recipe's instructions.
 */
public class InstructionStep {
    @ColumnInfo(name = "step_number")
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
