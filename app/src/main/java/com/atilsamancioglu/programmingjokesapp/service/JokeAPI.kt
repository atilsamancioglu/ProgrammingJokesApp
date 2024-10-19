package com.atilsamancioglu.programmingjokesapp.service

import com.atilsamancioglu.programmingjokesapp.model.Joke
import retrofit2.http.GET

interface JokeAPI {

    @GET("atilsamancioglu/ProgrammingJokesJSON/refs/heads/main/jokes.json")
    fun getData(): List<Joke>

}