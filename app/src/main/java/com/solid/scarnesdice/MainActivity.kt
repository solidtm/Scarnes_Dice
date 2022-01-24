package com.solid.scarnesdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.solid.scarnesdice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

         var userOverallScore: Int
         var usersTurnScore: Int
         var compOverallScore: Int
         var compTurnScore: Int

         binding.rollButton.setOnClickListener{

         }

    }
}