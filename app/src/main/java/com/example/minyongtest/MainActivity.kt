package com.example.minyongtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.minyongtest.vworld.RetrofitClient
import com.example.minyongtest.vworld.RetrofitViewModel
import com.example.minyongtest.vworld.Vworld
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val retrofitViewModel by viewModels<RetrofitViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofitViewModel.initNetWork()
    }
}