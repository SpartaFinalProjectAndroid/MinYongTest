package com.example.minyongtest.vworld

import com.google.gson.annotations.SerializedName

data class Vworld(
    @SerializedName("response")
    val response: Test,
)

data class Test(
    @SerializedName("status")
    val status: String,
)

