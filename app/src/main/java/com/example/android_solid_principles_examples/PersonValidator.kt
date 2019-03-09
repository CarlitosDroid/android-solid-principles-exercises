package com.example.android_solid_principles_examples

object PersonValidator {

    //Business Logic
    fun validate(mainActivity: MainActivity, person: Person): Boolean {
        //Ask for user information
        if(person.firstName.isNullOrEmpty()) {
            mainActivity.showValidationMessage("You didn't give us a valid first name!")
            return false
        }

        if(person.lastName.isNullOrEmpty()) {
            mainActivity.showValidationMessage("You didn't give us a valid last name!")
            return false
        }

        return true
    }
}