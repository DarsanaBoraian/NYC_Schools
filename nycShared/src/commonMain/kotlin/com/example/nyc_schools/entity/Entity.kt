package com.example.nyc_schools.entity

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class Entity(
    @SerialName("dbn")
    val dbn: String,
    @SerialName("school_name")
    val school_name: String
)