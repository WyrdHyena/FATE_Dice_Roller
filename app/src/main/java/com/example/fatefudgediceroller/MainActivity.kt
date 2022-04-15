package com.example.fatefudgediceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.rollDiceButton) // This variable saves a reference to the button-object identified by its individual id.
        rollButton.setOnClickListener {
            val rollResult = performRoll() // The val rollResult stores the result of the four dice as a List of Integers; this is necessary, because we want to use the result of the roll for multiple purposes. Without the variable, we had to re-call the function getting a new result every time.

            val diceOneText: TextView = findViewById(R.id.textDiceOne)
            diceOneText.text = rollResult[0].toString()

            val diceTwo: TextView = findViewById(R.id.textDiceTwo)
            diceTwo.text = rollResult[1].toString() // This line shows the List of the individual dice roll results.

            val diceThree: TextView = findViewById(R.id.textDiceThree)
            diceThree.text = rollResult[2].toString()

            val diceFour: TextView = findViewById(R.id.textDiceFour)
            diceFour.text = rollResult[3].toString()

            val overallResult = rollResult.sum() // To get the end result of the roll, the rollResult-List's entries are summed up.
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
            } // This shows the result sum of the roll in a text view.
        }
    }
}


fun performRoll(): List<Int> {
    fun roll(): Int {
        return (-1..1).random() // Generates a random Number between -1 and 1.
    }
    val result = IntArray(4) {roll()}.asList() // Generates an array of four elements between -1 and 1, simulating the four dice rolled.
    return result // The result is returned to the function, so the performRoll-function when called creates a list of 4 values between -1 and 1.
}

/*
Um eine Liste mit vier random Werten zwischen -1 und 1 auszuspucken:

fun main() {
	var result = IntArray(4) {diceRoll()}.asList() // Creates a List of four Items between -1 and 1 using the diceRoll-function to simulate the rolling of the four dice.
    var endSum = result.sum() // Sums up the values of the list to get the end result of the roll.
    println(result)
    println(endSum)
}


fun roll(): Int {
     return (-1..1).random() // Generates a random Number between -1 and 1.
}

 */

/*
TODO: Ein Button "Roll" der das Würfelergebnis als Array in einem Textfeld und die Gesamtsumme in einem anderen Textfeld ausspuckt.
 */