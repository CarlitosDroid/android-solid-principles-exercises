package com.example.android_solid_principles_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Using a string resource or constant, the responsibility is delegated
        tvWelcome.text = getString(R.string.welcome_message)

        //Pay attention, in this case the responsibility of EditTextView is to request data and provide data
        tvFirstName.text = getString(R.string.first_name_question)
        tvLastName.text = getString(R.string.last_name_question)

        settingUpViewListeners()
    }

    private fun settingUpViewListeners() {
        btnCreateAccountName.setOnClickListener {
            val person = PersonDataCapture.capture(etFirstName.text.toString(), etLastName.text.toString())
            if (!PersonValidator.validate(this, person)) return@setOnClickListener
            AccountGenerator.createAccount(this, person)
        }
    }

    fun showValidationMessage(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show()
    }
}
