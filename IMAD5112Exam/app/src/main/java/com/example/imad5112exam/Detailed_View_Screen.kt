package com.example.imad5112exam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailed_View_Screen : AppCompatActivity() {

    //declarations

    private lateinit var btnDetails: Button
    private lateinit var tvDetails: TextView
    private lateinit var btnBack: Button

    val Items = arrayOf("Tent", "Marshmallows", "Flashlight")
    val category= arrayOf("Shelter", "Food", "Safety")
    val Quantity= arrayOf("1", "3", "2")
    val comments= arrayOf("4-person waterproof","For S'mores (Mega size)", "Check batteries (AA)")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)


        //typecasting
        btnDetails = findViewById(R.id.tvDetails)
        tvDetails = findViewById(R.id.tvDetails)
        btnBack = findViewById(R.id.btnBack)

       btnDetails.setOnClickListener {

           //variable that will store the final output
           var displayText = "Items list:\n\n"

           //loop through the array

           for(i in 0 until Items.size){

               //add each student name to displayText
               displayText += Items[i] + "\n"
           }
           //Display the result (for example in the textview)
           tvDetails.text = displayText

           //variable that will store the final output
           var displayCategory = "Category list list:\n\n"

           //loop through the array

           for(i in 0 until category.size){

               //add each student name to displayText
               displayCategory += category[i] + "\n"

           }

                tvDetails.text = displayCategory

           //Display the result (for example in the textview)
           tvDetails.text = displayText

           //variable that will store the final output
           var displayQuantity = "Quantity list list:\n\n"

           //loop through the array

           for(i in 0 until Quantity.size){

               //add each student name to displayText
               displayQuantity += Quantity[i] + "\n"

           }

           tvDetails.text = displayQuantity

           //variable that will store the final output
           var displayComments = "Quantity list list:\n\n"

           //loop through the array

           for(i in 0 until comments.size){

               //add each student name to displayText
               displayComments += comments[i] + "\n"

           }

           tvDetails.text = displayQuantity

        btnBack.setOnClickListener {
            finish()


        }










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}}