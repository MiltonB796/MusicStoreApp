package com.example.musicstoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText: TextView = findViewById(R.id.helloText)
        val tapButton: Button = findViewById(R.id.tapButton)

        tapButton.setOnClickListener {
            helloText.text = "You tapped the button!"
        }
    }
}