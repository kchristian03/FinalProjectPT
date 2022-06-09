package com.vintech.finalprojectpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vintech.finalprojectpt.databinding.ActivityHomeScreenBinding

class HomeScreen : AppCompatActivity() {
    private lateinit var bind : ActivityHomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityHomeScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)


    }
}