package com.respapi.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignIn : AppCompatActivity() {
    private lateinit var signIn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        signIn = findViewById(R.id.button3)

        signIn.setOnClickListener {
            val IntentAc = Intent(this, HomeSc::class.java) //assigns the intent to a variable which we can use
            startActivity(IntentAc)

        }
    }
}