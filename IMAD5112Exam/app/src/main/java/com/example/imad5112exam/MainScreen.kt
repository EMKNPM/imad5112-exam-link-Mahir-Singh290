package com.example.imad5112exam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {

    //Declarations

    private lateinit var btnGear1 : Button
    private lateinit var btnGear2 : Button
    private lateinit var btnGear3 : Button
    private lateinit var btnTotal: Button
    private lateinit var tvTotalItems : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)

        //Typecasting
        btnGear1 = findViewById(R.id.btnGear1)
        btnGear2 = findViewById(R.id.btnGear2)
        btnGear3 = findViewById(R.id.btnGear3)
        btnTotal = findViewById(R.id.btnTotal)
        tvTotalItems = findViewById(R.id.tvTotalItems)



        btnGear1.setOnClickListener {

            tvTotalItems.text = "1 Tent"
        }

        btnGear3.setOnClickListener {

            tvTotalItems.text = "3 Marshmallows"
        }

        btnGear2.setOnClickListener {

            tvTotalItems.text = "3 Flashlights"
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}