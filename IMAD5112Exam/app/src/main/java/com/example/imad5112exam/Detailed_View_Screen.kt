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










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}