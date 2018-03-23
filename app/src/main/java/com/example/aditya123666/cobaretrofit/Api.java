package com.example.aditya123666.cobaretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Aditya123666 on 23/03/2018.
 */

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";


    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
