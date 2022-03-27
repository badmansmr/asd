package com.android.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener {
            val text1 = "Антон, почему Саша - пидорас, а не ты? Хмм..."
            val duration = Toast.LENGTH_LONG

            val toast = Toast.makeText(applicationContext, text1, duration)
            toast.setGravity(Gravity.BOTTOM, 0, 200)
            toast.show()
        }

        myButton.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        val myButton2 = findViewById<Button>(R.id.button2)
        myButton2.setOnClickListener {
            val text = "Еще раз нажмешь - пизды получишь"
            val duration = Toast.LENGTH_LONG

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.setGravity(Gravity.BOTTOM, 0, 200)
            toast.show()
        }
    }
}