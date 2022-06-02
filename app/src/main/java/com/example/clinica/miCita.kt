package com.example.clinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clinica.databinding.ActivityMiCitaBinding

class miCita : AppCompatActivity() {

    private lateinit var binding : ActivityMiCitaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMiCitaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setupButtons()

    }


    private fun setupButtons(){
        binding.btnGoTo.setOnClickListener {

            startActivity(Intent(this,miPerfil::class.java))

        }



    }

}