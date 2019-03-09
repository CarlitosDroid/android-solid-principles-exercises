package com.example.android_solid_principles_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvWelcome.text = "Welcome to my application!"

        tvFirstName.text = "What is your first name?"

        tvLastName.text = "What is your last name?"

        btnCreateAccountName.setOnClickListener {
            //Ask for user information
            val person = Person()

            person.firstName = etFirstName.text.toString()

            person.lastName = etLastName.text.toString()

            //Checks to be sure the first name and last names are valid
            if (person.firstName.isNullOrEmpty()) {
                Toast.makeText(this, "You didn't give us a valid first name!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (person.lastName.isNullOrEmpty()) {
                Toast.makeText(this, "You didn't give us a valid last name!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            //Create a user name for the person
            Toast.makeText(
                this,
                "YOUR USERNAME IS ${person.firstName!!.substring(0, 1)} ${person.lastName}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
