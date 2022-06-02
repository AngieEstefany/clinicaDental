package com.example.clinica.Auth

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clinica.R
import com.example.clinica.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    override fun setTheme(theme: Resources.Theme?) {
        super.setTheme(R.style.splashtheme)
    }

    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.btnButton.setOnClickListener {

        }
    }
}