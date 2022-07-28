package com.nandani.otpscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var EnterOtp:TextView
    lateinit var etOtp1:EditText
    lateinit var etotp2:EditText
    lateinit var etotp3:EditText
    lateinit var etotp4:EditText

    var email: String = ""
    lateinit var tvEmail: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intent?.let { abc->
            if(abc.hasExtra("email"))
                email = abc.getStringExtra("email") as String
        }?:kotlin.run {  }
        tvEmail = findViewById(R.id.EnterOtp)

        tvEmail.setText(email)

    }
}