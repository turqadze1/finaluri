package com.example.finaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
        }
    }
