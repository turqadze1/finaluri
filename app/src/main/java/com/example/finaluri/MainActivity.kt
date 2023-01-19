package com.example.finaluri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent as Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Email =findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password =findViewById<EditText>(R.id.editTextTextPassword)
        val button = findViewById<Button>(R.id.button3)
        val registration =findViewById<TextView>(R.id.textView2)

        button.setOnClickListener {
            var  Email=Email.text.toString()
            var pass=password.text.toString()

            if (Email.isEmpty() || pass.isEmpty()){
                Toast.makeText(this, "please enter your email or password",Toast.LENGTH_SHORT).show()
            }
            else {
                val Intent = Intent(this,MainActivity2::class.java)
                startActivity(Intent)

            }

            registration.setOnClickListener{


                val Intent = Intent(this,MainActivity3::class.java)
                startActivity(Intent)
            }

        }

    }
}

