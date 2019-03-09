package com.example.android_solid_principles_examples

object PersonDataCapture {

    //Mapping
    fun capture(firstName: String, lastName: String): Person {
        //Ask for user information
        val person = Person()

        person.firstName = firstName

        person.lastName = lastName

        return person
    }
}