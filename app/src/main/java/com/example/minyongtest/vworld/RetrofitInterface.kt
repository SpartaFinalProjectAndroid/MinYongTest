package com.example.minyongtest.vworld

import com.example.minyongtest.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {
    @GET("data")
    fun videoInfo(
        @Query("request") request: String = "GetFeature",
        @Query("key") key: String = Constants.VWORLD_API_KEY,
        @Query("format") format: String = "json",
        @Query("data") data: String = "LT_L_FRSTCLIMB",
        //@Query("geomFilter") geomFilter: String = "",
        @Query("attrFilter") attrFilter: String = "emdCd:=:28710340",
    ): Call<Vworld>
}