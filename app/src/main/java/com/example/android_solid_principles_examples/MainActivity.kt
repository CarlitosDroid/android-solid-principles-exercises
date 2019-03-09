package com.example.android_solid_principles_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRequestUserInfo.setOnClickListener {


            ctvUserInfo.getUserInfoById(1)
        }
    }

    fun showUserMessage(){

    }
}
