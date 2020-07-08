package com.example.notis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.notis.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)

        binding.textViewForgotPassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        binding.buttonRegister?.setOnClickListener {
            startActivity(Intent(this, RegistrasiActivity::class.java))
        }

        binding.imageButtonRegister.setOnClickListener {
            startActivity(Intent(this,RegistrasiActivity::class.java))
        }

    }
}