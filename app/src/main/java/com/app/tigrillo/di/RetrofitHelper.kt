package com.app.tigrillo.di

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://firebasestorage.googleapis.com/v0/b/app-reydeltigrillo.appspot.com/o/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}