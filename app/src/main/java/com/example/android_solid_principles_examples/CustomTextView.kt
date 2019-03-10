package com.example.android_solid_principles_examples

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView

class CustomTextView : TextView {

    constructor (context: Context) : super(context)

    constructor (context: Context, attrs: AttributeSet?) : super(context, attrs)

    fun render(user: User) {
        text = "Name: ${user.name} \nLastName: ${user.lastName} \nAge: ${user.age}"
    }
}