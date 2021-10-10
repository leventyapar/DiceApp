package com.leventyapar.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button1)
        val dice1: ImageView = findViewById(R.id.imageView)
        val dice2: ImageView = findViewById(R.id.imageView2)


        dice1.setImageResource(R.drawable.dice_1)
        dice2.setImageResource(R.drawable.dice_1)

        rollButton.setOnClickListener{
            var random1 = (1..6).random()
            var random2 = (1..6).random()
            when(random1){
                1-> dice1.setImageResource(R.drawable.dice_1)
                2-> dice1.setImageResource(R.drawable.dice_2)
                3-> dice1.setImageResource(R.drawable.dice_3)
                4-> dice1.setImageResource(R.drawable.dice_4)
                5-> dice1.setImageResource(R.drawable.dice_5)
                else-> dice1.setImageResource(R.drawable.dice_6)
            }
            when(random2){
                1-> dice2.setImageResource(R.drawable.dice_1)
                2-> dice2.setImageResource(R.drawable.dice_2)
                3-> dice2.setImageResource(R.drawable.dice_3)
                4-> dice2.setImageResource(R.drawable.dice_4)
                5-> dice2.setImageResource(R.drawable.dice_5)
                else-> dice2.setImageResource(R.drawable.dice_6)
            }
        }


    }
}