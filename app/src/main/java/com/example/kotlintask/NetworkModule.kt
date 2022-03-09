package com.example.kotlintask

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object NetworkModule {
    /**
     * Default OkHttpClient instance with logging.
     */
    fun provideOkHttpClient(): OkHttpClient = provideOkHttpClientBuilder()
        .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
        .build()

    fun provideOkHttpClientBuilder(): OkHttpClient.Builder {
        return OkHttpClient.Builder()
            .ignoreAllSSLErrors() // required for gist
    }

    fun provideRetrofitBuilderGson(): Retrofit.Builder =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())

    fun provideRetrofitBuilderSerialization(): Retrofit.Builder {
        return Retrofit.Builder()
            .addConverterFactory(Json {
                ignoreUnknownKeys = true
            }.asConverterFactory(provideJsonConverterType()))
    }

    private fun provideJsonConverterType(): MediaType {
        return "application/json".toMediaType()
    }

    private fun provideRxJavaFactory(): RxJava2CallAdapterFactory =
        RxJava2CallAdapterFactory.create()
}