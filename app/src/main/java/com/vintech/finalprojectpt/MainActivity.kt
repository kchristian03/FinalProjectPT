package com.vintech.finalprojectpt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vintech.finalprojectpt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)
    }
}