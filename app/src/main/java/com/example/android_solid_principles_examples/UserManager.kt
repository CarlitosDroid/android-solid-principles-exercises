package com.example.android_solid_principles_examples

object UserManager {
    fun getUserById(userId: Int): User{
        val user = User()
        Thread.sleep(3000)
        user.id = userId
        user.name = "Carlos"
        user.lastName = "Vargas"
        user.age = 20
        return user
    }

    //You can add more methods in order to get user by other parameters...
}