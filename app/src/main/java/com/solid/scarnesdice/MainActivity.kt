package com.solid.scarnesdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.solid.scarnesdice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var userOverallScore: Int = 0
    private var usersTurnScore: Int = 0
    private var compOverallScore: Int = 0
    private var compTurnScore: Int = 0
    private var random: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)






        binding.rollButton.setOnClickListener {
            random = (1..6).random()
            val imageView = binding.diceImageView
            val scoreText = binding.scoreTextView

            when (random) {
                1 -> imageView.setImageResource(R.drawable.dice1)
                2 -> imageView.setImageResource(R.drawable.dice2)
                3 -> imageView.setImageResource(R.drawable.dice3)
                4 -> imageView.setImageResource(R.drawable.dice4)
                5 -> imageView.setImageResource(R.drawable.dice5)
                6 -> imageView.setImageResource(R.drawable.dice6)
            }

            if (random != 1) {
                usersTurnScore = random
                scoreText.text = "Your turn score: $random "
            }else if(random == 1){
                usersTurnScore = 0
                scoreText.text = "Your turn score: 0 "
            }
        }

        binding.holdButton.setOnClickListener {
            userOverallScore += random
            usersTurnScore = 0

            binding.scoreTextView.text = "Your turn score: 0 "
        }

        binding.resetButton.setOnClickListener{
            userOverallScore = 0
            usersTurnScore = 0
            compOverallScore = 0
            compTurnScore = 0

            binding.scoreTextView.text = "Your score: 0 Computer score: 0"
        }
    }




}