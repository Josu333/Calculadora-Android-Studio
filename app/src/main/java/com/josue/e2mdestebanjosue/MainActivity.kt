package com.josue.e2mdestebanjosue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.josue.e2mdestebanjosue.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var primerNum = 0.0
    private  var segundoNum = 0.0
    private var operacion: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        operacion = null
        //binding.btn0.setOnClickListener(binding.screen.text="0");

    }
    fun pulsacion (){

    }

}