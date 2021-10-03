package com.phoenixwings7.phoenixyummies.spoonacularapi;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RecipeApi {
    public static RecipeApiService getRecipeApi() {
        OkHttpClient okHttpClient = getClientWithApiKey();
        Retrofit retrofitBuilder = new Retrofit.Builder()
                .baseUrl(RecipeApiService.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
                .client(okHttpClient)
                .build();

        return retrofitBuilder.create(RecipeApiService.class);
    }

    private static OkHttpClient getClientWithApiKey() {
        return new OkHttpClient().newBuilder()
                .addInterceptor(chain -> {
                    Request originalRequest = chain.request();

                    HttpUrl urlWithApiKey = originalRequest.url().newBuilder()
                            .addQueryParameter("apiKey", RecipeApiService.API_KEY)
                            .build();

                    Request requestWithApiKey = originalRequest.newBuilder()
                            .url(urlWithApiKey)
                            .build();

                    return chain.proceed(requestWithApiKey);
                }).build();
    }
}
