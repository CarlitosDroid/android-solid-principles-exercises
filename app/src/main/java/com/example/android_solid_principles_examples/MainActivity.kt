package com.example.android_solid_principles_examples

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRequestUserInfo.setOnClickListener {
            val userId = 1
            UserInfoAsyncTask(userId).execute()
        }
    }

    private fun showUserMessage(string: String) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show()
    }

    @SuppressLint("StaticFieldLeak")
    inner class UserInfoAsyncTask(var userId: Int) : AsyncTask<Void, Void, User>() {

        override fun onPreExecute() {
            super.onPreExecute()
            showUserMessage(getString(R.string.request_user_message, userId))
        }

        override fun doInBackground(vararg params: Void?): User {
            return UserManager.getUserById(userId)
        }

        override fun onPostExecute(user: User) {
            super.onPostExecute(user)
            ctvUserInfo.render(user)
        }
    }
}
