package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById(R.id.button) as Button



        fun removeAAA(){
            btnClick.setOnClickListener {

                val aaaList = arrayListOf("aaa1111","aaa2222","aaa3333")



                aaaList.forEach{
                    it.removePrefix("aaa")
                }

            }
        }




    }
}