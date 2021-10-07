package com.example.pokemon_api.model.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Pokemon (
    @Expose @SerializedName("id") val id: Int,
    @Expose @SerializedName("name") val name: String,
    @Expose @SerializedName("weight") val weight: Int,
    @Expose @SerializedName("height") val height: Int,
    @Expose @SerializedName("sprites") val sprites: Sprites,
    @Expose @SerializedName("base_experience") val experience: Int,
    @Expose @SerializedName("species") val especie: Especie
)

data class Especie(
    @Expose @SerializedName("name") val Especie1: String,
)
data class Sprites (
    @Expose @SerializedName("front_default") val frontDefault: String?,
    @Expose @SerializedName("front_shiny") val frontShiny: String?
)
