package com.example.baitaptuan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val bundle=intent.extras
        bundle?.let{
            val email=bundle.getString("Email")
            val password=bundle.getString("password")
            etPasswordSignUp.setText(email);
            etPasswordSignup.setText(password)
        }




        tvSignInSignUp.setOnClickListener{
            val intent= Intent(this,Login::class.java)
            startActivity(intent)

        }
    }
}