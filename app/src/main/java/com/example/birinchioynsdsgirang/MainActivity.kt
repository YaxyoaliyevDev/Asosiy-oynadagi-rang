package com.example.birinchioynsdsgirang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.birinchioynsdsgirang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.next.setOnClickListener {
            val intent = Intent(this, Second_Activity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        when (Rang.color) {
            "green" -> binding.mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.green))
            "blue" -> binding.mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.blue))
            "red" -> binding.mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.red))
            "orange" -> binding.mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.orange))
            "purple" -> binding.mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.purple))
            "black" -> binding.mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.black))
            "yellow" -> binding.mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.yellow))
            "white" -> binding.mainLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.white))
        }
    }
}