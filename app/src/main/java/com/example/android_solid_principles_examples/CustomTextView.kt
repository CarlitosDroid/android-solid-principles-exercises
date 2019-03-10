package com.example.android_solid_principles_examples

import android.annotation.SuppressLint
import android.content.Context
import android.os.AsyncTask
import android.util.AttributeSet
import android.widget.TextView
import android.widget.Toast

class CustomTextView : TextView {

    var user = User()

    constructor (context: Context) : super(context)

    constructor (context: Context, attrs: AttributeSet?) : super(context, attrs)

    fun getUserInfoById(userId: Int) {
        UserInfoAsyncTask(userId).execute()
    }

    private fun render() {
        text = "Name: ${user.name} \nLastName: ${user.lastName} \nAge: ${user.age}"
    }

    @SuppressLint("StaticFieldLeak")
    inner class UserInfoAsyncTask(var userId: Int) : AsyncTask<Void, Void, User>() {

        override fun onPreExecute() {
            super.onPreExecute()
            Toast.makeText(context, "Requesting User Info with id ${userId}…", Toast.LENGTH_SHORT).show()
        }

        override fun doInBackground(vararg params: Void?): User {
            val user = User()
            Thread.sleep(3000)
            user.id = userId
            user.name = "Carlos"
            user.lastName = "Vargas"
            user.age = 20
            return user
        }

        override fun onPostExecute(user: User) {
            super.onPostExecute(user)
            this@CustomTextView.user = user
            render()
        }
    }
}