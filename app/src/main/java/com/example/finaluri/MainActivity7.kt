package com.example.finaluri

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity7 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val Imageview1 = findViewById<ImageView>(R.id.imageView5)
        Imageview1.setOnClickListener {
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
        val Imageview2 = findViewById<ImageView>(R.id.imageView3)
        Imageview2.setOnClickListener {
            val Intent = Intent(this,MainActivity6::class.java)
            startActivity(Intent)
        }
    }
}