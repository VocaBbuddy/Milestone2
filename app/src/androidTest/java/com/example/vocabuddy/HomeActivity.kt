package com.example.vocabuddy

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Find views by ID
        val inputText: EditText = findViewById(R.id.inputText)
        val outputText: TextView = findViewById(R.id.outputText)
        val translateButton: Button = findViewById(R.id.translateButton)
        val connectButton: Button = findViewById(R.id.connectButton)

        // Translate Button click listener
        translateButton.setOnClickListener {
            val userInput = inputText.text.toString()
            if (userInput.isNotEmpty()) {
                // Simple placeholder for translation logic
                outputText.text = "Translated: $userInput"
            } else {
                Toast.makeText(this, "Please enter text to translate", Toast.LENGTH_SHORT).show()
            }
        }

        // Connect to Device Button click listener (Placeholder)
        connectButton.setOnClickListener {
            Toast.makeText(this, "Connecting to Device...", Toast.LENGTH_SHORT).show()
        }
    }
}
