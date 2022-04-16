package com.example.fatefudgediceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

var overallResult = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button =
            findViewById(R.id.rollDiceButton) // This variable saves a reference to the button-object identified by its individual id.
        rollButton.setOnClickListener {

            overallResult = 0 // Sets the overallResult back to 0 when the button is clicked; otherwise it would constantly be updated.

            val diceOneImage: ImageView = findViewById(R.id.diceImage1)
            diceOneImage.setImageResource(performRoll())

            val diceTwoImage: ImageView = findViewById(R.id.diceImage2)
            diceTwoImage.setImageResource(performRoll())

            val diceThreeImage: ImageView = findViewById(R.id.diceImage3)
            diceThreeImage.setImageResource(performRoll())

            val diceFourImage: ImageView = findViewById(R.id.diceImage4)
            diceFourImage.setImageResource(performRoll())

            val resultTextView: TextView = findViewById(R.id.textResult)
            resultTextView.text = when {
                overallResult <= -2 -> "$overallResult: Terrible"
                overallResult == -1 -> "-1: Poor"
                overallResult == 0 -> "0: Mediocre"
                overallResult == 1 -> "1: Average"
                overallResult == 2 -> "2: Fair"
                overallResult == 3 -> "3: Good"
                overallResult == 4 -> "4: Great"
                overallResult == 5 -> "5: Superb"
                overallResult == 6 -> "6: Fantastic"
                overallResult == 7 -> "7: Epic"
                else -> "$overallResult: Legendary"
            }
        }
    }
}


fun performRoll(): Int {
    val diceRoll = (-1..1).random() // Determine the outcome of a single dice (-1, 0 or +1).
    overallResult += diceRoll // Updates the overallResult for each "dice", so the result of the roll can be calculated.
    val diceImage = when (diceRoll) {
        -1 -> R.drawable.fatedieminus
        0 -> R.drawable.fatediezero
        else -> R.drawable.fatedieplus
    }
    return diceImage
}
