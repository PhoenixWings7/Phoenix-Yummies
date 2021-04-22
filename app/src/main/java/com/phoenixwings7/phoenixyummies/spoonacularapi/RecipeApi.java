package com.phoenixwings7.phoenixyummies.spoonacularapi;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecipeApi {
    public RecipeApiService getRecipeApi() {
        OkHttpClient okHttpClient = getClientWithApiKey();
        Retrofit retrofitBuilder = new Retrofit.Builder()
                .baseUrl(RecipeApiService.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        RecipeApiService recipeApiService = retrofitBuilder.create(RecipeApiService.class);

        return recipeApiService;
    }

    private OkHttpClient getClientWithApiKey() {
        return new OkHttpClient().newBuilder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request originalRequest = chain.request();

                        HttpUrl urlWithApiKey = originalRequest.url().newBuilder()
                                .addQueryParameter("apiKey", RecipeApiService.API_KEY)
                                .build();

                        Request requestWithApiKey = originalRequest.newBuilder()
                                .url(urlWithApiKey)
                                .build();

                        return chain.proceed(requestWithApiKey);
                    }
                }).build();
    }
}
