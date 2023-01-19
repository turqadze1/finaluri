package com.example.finaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.InputFilter.LengthFilter
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import java.util.Objects

class MainActivity3 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val Name=findViewById<EditText>(R.id.editTextTextPersonName)
        val em = findViewById<EditText>(R.id.editTextTextEmailAddress2)
        val passw=findViewById<EditText>(R.id.editTextTextPassword2)
        val button=findViewById<Button>(R.id.button2)


        button.setOnClickListener{


            var  em=em.text.toString()
            var  Name = Name.text.toString()
            var passw = passw.text.toString()
            var button = button.text.toString()

            if (em.isEmpty() || Name.isEmpty() || passw.isEmpty()){
                Toast.makeText(this, "Fill in all fields",Toast.LENGTH_SHORT).show()
            }
            else {
                val Intent = Intent(this,MainActivity4::class.java )




                startActivity(Intent)
            }

            
        }
    }
}
