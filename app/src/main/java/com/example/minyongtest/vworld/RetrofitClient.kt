package com.example.minyongtest.vworld

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitClient {
    private const val BASE_URL = "https://api.vworld.kr/req/"
    private var retrofitClient: Retrofit? = null

    fun getClient(): Retrofit? {
        Log.d("Client", "csh RetrofitClient - getClient() called")

        if (retrofitClient == null) {
            retrofitClient = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(OkHttpClient.Builder().connectTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    }).build())
                .build()
        }
        return retrofitClient
    }

    val vworldAPI : RetrofitInterface? = getClient()?.create(RetrofitInterface::class.java)
}