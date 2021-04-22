package com.phoenixwings7.phoenixyummies.spoonacularapi;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RecipeSearchResult {
    private long id;
    private String title;
    private String image;
    @SerializedName("missedIngredients")
    private final List<Ingredient> additionalIngredients = new ArrayList<Ingredient>();
    @SerializedName("usedIngredients")
    private final List<Ingredient> queriedIngredients = new ArrayList<Ingredient>();

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public List<Ingredient> getAdditionalIngredients() {
        return additionalIngredients;
    }

    public List<Ingredient> getQueriedIngredients() {
        return queriedIngredients;
    }

}
