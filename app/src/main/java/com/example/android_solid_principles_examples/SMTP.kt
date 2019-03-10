package com.example.android_solid_principles_examples

import android.util.Log

class SMTP {
    fun sendEmailToCustomer(to: String, subject: String, body: String) {
        Log.e("EMAIL SENT", "to: $to - subject: $subject - body: $body")
    }
}