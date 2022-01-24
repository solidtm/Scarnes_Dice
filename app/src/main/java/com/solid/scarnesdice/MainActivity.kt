package com.solid.scarnesdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
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
            val random = (1..6).random()
            var imageView = binding.diceImageView

            when(random){
                1 ->  imageView.setImageResource(R.drawable.dice1)
                2 ->  imageView.setImageResource(R.drawable.dice2)
                3 ->  imageView.setImageResource(R.drawable.dice3)
                4 ->  imageView.setImageResource(R.drawable.dice4)
                5 ->  imageView.setImageResource(R.drawable.dice5)
                6 ->  imageView.setImageResource(R.drawable.dice6)
            }
         }

    }
}