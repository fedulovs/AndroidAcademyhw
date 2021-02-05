package com.example.androidacademyhw.data.models

import kotlinx.serialization.Serializable

@Serializable
data class Spoken(
    val english_name: String?,
    val iso_639_1: String,
    val name: String
)