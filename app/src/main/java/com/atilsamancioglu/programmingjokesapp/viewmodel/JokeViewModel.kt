package com.atilsamancioglu.programmingjokesapp.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.atilsamancioglu.programmingjokesapp.model.Joke
import com.atilsamancioglu.programmingjokesapp.service.JokeAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class JokeViewModel : ViewModel() {

    private val BASE_URL = "https://raw.githubusercontent.com/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(JokeAPI::class.java)

    val jokeList = mutableStateOf<List<Joke>>(listOf())


    fun getJokes() {
        viewModelScope.launch(Dispatchers.IO) {
            jokeList.value = retrofit.getData()
        }
    }

}