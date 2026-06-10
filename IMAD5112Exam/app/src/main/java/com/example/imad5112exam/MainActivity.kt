// Student Number ST10514124
//Full name: Mahir Singh
package com.example.imad5112exam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declaration of the Main screen button

    private lateinit var btnMainScreen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //typecasting of main screen button
        btnMainScreen = findViewById(R.id.btnMainScreen)

        //Main screen button to go to the next screen
        btnMainScreen.setOnClickListener {

            //an intent used to get to the new screen
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)



        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}