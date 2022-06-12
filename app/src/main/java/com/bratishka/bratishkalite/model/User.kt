package com.bratishka.bratishkalite.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: String,
    @SerializedName("surname")
    val surname: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("fathername")
    val fathername: String?,
    @SerializedName("email")
    val email: String,
    @SerializedName("date_birth")
    val dateBirth: String?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("number_phone")
    val numberPhone: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("image")
    val image: String?,
    @SerializedName("basket_id")
    val idBasket: String?
) : java.io.Serializable
