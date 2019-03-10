package com.example.android_solid_principles_examples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        ivComputer.setOnClickListener {
            startActivity(Intent(this@HomeActivity, OrderActivity::class.java))
            finish()
        }
    }
}
