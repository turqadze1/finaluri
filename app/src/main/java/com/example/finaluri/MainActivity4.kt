package com.example.finaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val done = findViewById<ImageView>(R.id.imageView)
        done.setOnClickListener{




        val Intent = Intent(this,MainActivity::class.java)
        startActivity(Intent)
    }
}}