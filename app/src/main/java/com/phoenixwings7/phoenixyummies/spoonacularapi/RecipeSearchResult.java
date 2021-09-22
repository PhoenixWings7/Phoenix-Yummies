package com.phoenixwings7.phoenixyummies.spoonacularapi;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RecipeSearchResult extends Recipe {

    @SerializedName("missedIngredients")
    private List<Ingredient> additionalIngredients = new ArrayList<>();

    @SerializedName("usedIngredients")
    private List<Ingredient> queriedIngredients = new ArrayList<>();

    public List<Ingredient> getAdditionalIngredients() {
        return additionalIngredients;
    }

    public List<Ingredient> getQueriedIngredients() {
        return queriedIngredients;
    }

    public void setAdditionalIngredients(List<Ingredient> additionalIngredients) {
        this.additionalIngredients = additionalIngredients;
    }

    public void setQueriedIngredients(List<Ingredient> queriedIngredients) {
        this.queriedIngredients = queriedIngredients;
    }
}
