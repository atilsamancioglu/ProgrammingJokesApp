package com.atilsamancioglu.programmingjokesapp.model

data class Joke (
    val error: Boolean,
    val category: Category,
    val type: String?,
    val setup: String? = null,
    val delivery: String? = null,
    val flags: Flags,
    val id: Long,
    val safe: Boolean,
    val lang: Lang,
    val joke: String? = null
)

enum class Category {
    Programming
}

data class Flags (
    val nsfw: Boolean,
    val religious: Boolean,
    val political: Boolean,
    val racist: Boolean,
    val sexist: Boolean,
    val explicit: Boolean
)

enum class Lang {
    En
}

enum class Type {
    Single,
    Twopart
}

