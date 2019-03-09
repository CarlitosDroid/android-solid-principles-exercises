package com.example.android_solid_principles_examples

import android.os.AsyncTask

class UserInfoAsyncTask(var userId: Int) : AsyncTask<Void, Void, User>() {

    override fun onPreExecute() {
        super.onPreExecute()
        Toast.makeText(context, "Requesting User Info with id $userId...", Toast.LENGTH_LONG).show()
    }

    override fun doInBackground(vararg params: Void?): User {
        val user = User()
        Thread.sleep(3000)
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