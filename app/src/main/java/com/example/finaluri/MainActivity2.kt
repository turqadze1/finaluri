package com.example.finaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.finaluri.databinding.ActivityMain2Binding
import com.example.finaluri.databinding.ActivityMain6Binding
import java.text.DateFormat
import java.util.Calendar

class MainActivity2 : AppCompatActivity() {
    lateinit var viewPager:ViewPager2




    private lateinit var binding: ActivityMain2Binding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMain2Binding.inflate(layoutInflater)




        setContentView(binding.root)
        replaceFragment(home())
        replaceFragment(person())
        replaceFragment(moon())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.home -> replaceFragment(home())

                R.id.profile -> replaceFragment(person())
                R.id.moon -> replaceFragment(moon())

                else ->{



                }


            }

            true
        }


        val calendar = Calendar.getInstance().time
        val dateFormat = DateFormat.getInstance().format(calendar)

        val dateTextView = findViewById<TextView>(R.id.textView5)
        dateTextView.text = dateFormat
    }
    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val Intent = Intent(this,MainActivity5::class.java)
            startActivity(Intent)
        }
        val Imageview = findViewById<ImageView>(R.id.imageView2)
        Imageview.setOnClickListener {
            val Intent = Intent(this,MainActivity7::class.java)
            startActivity(Intent)
        }


        viewPager= findViewById(R.id.viewPager)

        val fragments:ArrayList<Fragment> = arrayListOf(

            Page1Fragment()
        )
        val adapter=ViewPagerAdapter(fragments,this)
        viewPager.adapter = adapter



        }

    override fun onBackPressed() {
        if(viewPager.currentItem == 0){
            super.onBackPressed()


        }else {
            viewPager.currentItem = viewPager.currentItem - 1
        }


    }




    }
