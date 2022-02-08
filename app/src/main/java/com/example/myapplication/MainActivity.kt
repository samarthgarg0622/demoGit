package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var clickButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        clickButton = findViewById(R.id.clickButton)
//        clickButton.setOnClickListener {
//            Toast.makeText(applicationContext , "It's Samarth ", Toast.LENGTH_SHORT).show()
//        }
//
        println("hello")

    }
}