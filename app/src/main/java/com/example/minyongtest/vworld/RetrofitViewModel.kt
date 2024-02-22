package com.example.minyongtest.vworld

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RetrofitViewModel : ViewModel() {

    fun initNetWork() = viewModelScope.launch {
        val apiData : Call<Vworld> = RetrofitClient.vworldAPI!!.videoInfo()

        apiData.enqueue(object : Callback<Vworld>{
            override fun onResponse(call: Call<Vworld>, response: Response<Vworld>) {
                Log.i("Minyong2", response.body()?.response?.status.toString())

            }

            override fun onFailure(call: Call<Vworld>, t: Throwable) {
                Log.i("Minyong2", "실패...")
            }

        })
    }
}