package com.example.mealapplicationst10477052

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mealsuggestionappst10477052.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // start
// declaration
// num = edtTime -this is the time input by user (Morning,Mid-Morning,Afternoon,Mid-Afternoon,Dinner))
// num = answerBox
// strMorning = randomOne ( Overnight oats, Eggs and Toast,  Yogurt , Health Smoothies ,  Protien Shake)
// strMidMorning = randomTwo ( Cottage Cheese and toast, Assorted Nuts , Avacado, Berries, Peanut Butter and rice cakes)
// strAfternoon = randomThree ( Classic BLT Sandwich , peanut Butter Sandwich, chicken Salad, Steak and Frozen vege mix , Burgers and fries )
// strMidAfternoon = randomFour  ( hummus and vegetables, Berries and Yogurt, mini wraps , Potato pockets )
// strDinner = randomFive ( Pasta and pesto , lasagna , Chinese Stirfry, Baked chesse mushrooms , Curry and rice )
// if user enters morning output answerBox = randomOne
// if user enter Mid-Morning output answerBox = randomTwo
// if user enters Afternoon output answerBox =  randomThree
// if user enters Mid-Afternoon output answerBox =  randomFour
// if user enters Dinner output answerBox =  randomFive
//endif
//endif
//endif
//endif
//endif
// if user does not enter a valid input output " Please enter a valid input "
// else output AnswerBox
// stop
        // ALL CODE WRITTEN WAS CHECKED AND CORRECTED WHERE NEEDED BY GEMINI
        val answerBox = findViewById<TextView>(R.id.answerBox)
        val refreshButton = findViewById<Button>(R.id.refresh_button)
        val edtTime = findViewById<EditText>(R.id.edtTime)
        val realRefreshButton = findViewById<Button>(R.id.real_refresh_button)

        // topic list was taught by Philip Lackner (  Philip Lackner,2020, Kotlin Newbie To Pro - LISTS - Part 14 , https://www.youtube.com/watch?v=VpDBP-4HUyg)
        val topicListMorning = listOf("Overnight Oats", "Eggs and Toast", "Yogurt", "Health Smoothies", "Protein Shake")
        val topicListMidMorning = listOf("Cottage Cheese and toast", "Assorted Nuts", "Avocado", "Berries", "Peanut Butter and rice cakes" )
        val topicListAfternoon = listOf("Classic BLT Sandwich", "Peanut Butter Sandwich", "Chicken Salad", "Steak and Frozen Veggie Mix", "Burgers and Fries" )
        val topicListMidAfternoon = listOf("Hummus and vegetables", "Berries and Yogurt", "Mini Wraps", "Potato Pockets")
        val topicListDinner = listOf("Pasta and Pesto", "Lasagna", "Chinese Stir Fry", "Baked Cheese Mushrooms", "Curry and Rice")
        val topicListAfterDinner = listOf("Ice-Cream", "Malva Pudding", "Cake", "Custard", "Cheese Cake")

        // refreshButton.setOnClickListener {
        //            val time = edtTime.text.toString()
        //            val isAnalogTime = time.matches(Regex("^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")) // Regex for HH:mm format
        //
        //            val selectedMeal = if (isAnalogTime) {
        //                "Invalid Input, Please enter eg.(Morning, Mid Morning)"
        //            } else {
        // The above code in the comment was taken from gemini
        refreshButton.setOnClickListener {
            val time = edtTime.text.toString()
            val isAnalogTime = time.matches(Regex("^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$")) // Regex for HH:mm format

            val selectedMeal = if (isAnalogTime) {
                "Invalid Input, Please enter eg.(Morning, Mid Morning)"
            } else {

                // when taught by philip lackner  (  Philip Lackner,2020,Kotlin Newbie To Pro - WHEN - Part 15, https://www.youtube.com/watch?v=skBnjeONMc0&t=685s)
                // ignorecase = true was added by gemini
                when {
                    time.equals("Morning", ignoreCase = true) -> topicListMorning.random()
                    time.equals("Breakfast", ignoreCase = true) -> topicListMorning.random()
                    time.equals("Mid-Morning snack", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("Mid-Morning", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("MidMorning", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("Mid Morning", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("Light Snack", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("Lightsnack", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("MidMorningsnack", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("Mid Morning snack", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("MidMorning snack", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("Mid Morningsnack", ignoreCase = true) -> topicListMidMorning.random()
                    time.equals("Afternoon", ignoreCase = true) -> topicListAfternoon.random()
                    time.equals("Lunch", ignoreCase = true) -> topicListAfternoon.random()
                    time.equals("Mid-Afternoon snack", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("Mid-Afternoon", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("MidAfternoon", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("Mid Afternoon", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("MidAfternoonsnack", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("Quick Bites", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("Quickbites", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("Mid Afternoonsnack", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("Mid Afternoon snack", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("MidAfternoon snack", ignoreCase = true) -> topicListMidAfternoon.random()
                    time.equals("Dinner", ignoreCase = true) -> topicListDinner.random()
                    time.equals("Main Course", ignoreCase = true) -> topicListDinner.random()
                    time.equals("Maincourse", ignoreCase = true) -> topicListDinner.random()
                    time.equals("After-Dinner snack", ignoreCase = true) -> topicListAfterDinner.random()
                    time.equals("Desserts", ignoreCase = true) -> topicListAfterDinner.random()
                    time.equals("After Dinner", ignoreCase = true) -> topicListAfterDinner.random()
                    time.equals("AfterDinner", ignoreCase = true) -> topicListAfterDinner.random()
                    time.equals("AfterDinner snack", ignoreCase = true) -> topicListAfterDinner.random()
                    time.equals("After Dinnersnack", ignoreCase = true) -> topicListAfterDinner.random()
                    time.equals("After-Dinner snack", ignoreCase = true) -> topicListAfterDinner.random()
                    else -> "Please enter a valid input, $time is not a valid input"
                }
            }
            answerBox.text = selectedMeal
        }
        // this function was sourced from a previous project that we had covered in class
        realRefreshButton.setOnClickListener {
            edtTime.text.clear()
            answerBox.text = ""
            // ALL CODE WRITTEN WAS CHECKED AND CORRECTED WHERE NEEDED BY GEMINI
        }
    }
}