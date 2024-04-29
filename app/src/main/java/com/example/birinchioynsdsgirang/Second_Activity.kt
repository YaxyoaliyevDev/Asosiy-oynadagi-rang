package com.example.birinchioynsdsgirang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birinchioynsdsgirang.databinding.ActivitySecondBinding

class Second_Activity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            Rang.color = "green"
        }
        binding.btn2.setOnClickListener {
            Rang.color = "blue"
        }
        binding.btn3.setOnClickListener {
            Rang.color = "red"
        }
        binding.btn4.setOnClickListener {
            Rang.color = "orange"
        }
        binding.btn5.setOnClickListener {
            Rang.color = "purple"
        }
        binding.btn6.setOnClickListener {
            Rang.color = "black"
        }
        binding.btn7.setOnClickListener {
            Rang.color = "yellow"
        }
        binding.btn8.setOnClickListener {
            Rang.color = "dark blue"
        }


    }
}