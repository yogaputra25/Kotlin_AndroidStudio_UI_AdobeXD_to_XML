package com.respapi.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.respapi.myapp.uiFragment.Home
import kotlinx.coroutines.Dispatchers.Main

class MainActivity : AppCompatActivity() {
    private lateinit var signIn : Button
    private lateinit var signUp : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn = findViewById(R.id.signin)
        signUp = findViewById(R.id.button2)
        signIn.setOnClickListener {
            val IntentAc = Intent(this, SignIn::class.java) //assigns the intent to a variable which we can use
            startActivity(IntentAc)

        }
        signUp.setOnClickListener {
            val IntentAc = Intent(this, SignUp::class.java) //assigns the intent to a variable which we can use
            startActivity(IntentAc)

        }
    }
}