package com.example.finaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.finaluri.databinding.ActivityMain2Binding
import com.example.finaluri.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)













        setContentView(R.layout.activity_main6)
        val name =findViewById<TextView>(R.id.textView12)
        val email = findViewById<TextView>(R.id.textView13)
        val password = findViewById<TextView>(R.id.textView14)
        val Imageview3 =findViewById<ImageView>(R.id.imageView4)
        Imageview3.setOnClickListener {
            val Intent = Intent(this,MainActivity7::class.java)
            startActivity(Intent)
        }

    }
}