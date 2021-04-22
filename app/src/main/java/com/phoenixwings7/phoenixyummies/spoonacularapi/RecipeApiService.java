package com.phoenixwings7.phoenixyummies.spoonacularapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RecipeApiService {
    static final String baseUrl = "https://api.spoonacular.com/";
    static final String API_KEY = System.getenv("API_KEY");

    @GET("recipes/{id}/analyzedInstructions")
    Call<List<RecipeInstructionPart>> getInstructions(@Path("id") int recipeId, @Query("apiKey") String API_KEY);

    // ignorePantry default is true
    @GET("https://api.spoonacular.com/recipes/findByIngredients?ingredients={ingredients}")
    Call<RecipeSearchResult> searchForRecipeByIngredients(@Path("ingredients") String ingredients);

    @GET("https://api.spoonacular.com/recipes/findByIngredients?ingredients={ingredients}" +
            "&ignorePantry={ignorePantry}")
    Call<RecipeSearchResult> searchForRecipeByIngredients(@Path("ingredients") String ingredients,
                                                          @Path("ignorePantry") boolean ignorePantry);
}
