package com.food.ordering.zinger.data.model
import com.google.gson.annotations.SerializedName


data class UpdateUserResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: String,
    @SerializedName("message")
    val message: String
)