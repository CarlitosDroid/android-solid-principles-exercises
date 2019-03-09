package com.example.android_solid_principles_examples

object AccountGenerator {

    fun createAccount(mainActivity: MainActivity, person: Person){
        mainActivity.showValidationMessage("YOUR USERNAME IS ${person.firstName!!.substring(0,1)} ${person.lastName}")
    }
}