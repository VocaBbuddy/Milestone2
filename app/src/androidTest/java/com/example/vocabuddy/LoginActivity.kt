package com.example.vocabuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Link to your activity_login.xml

        // Find views by ID
        val username: EditText = findViewById(R.id.username)
        val password: EditText = findViewById(R.id.password)
        val loginButton: Button = findViewById(R.id.loginButton)

        // Handle Login Button click
        loginButton.setOnClickListener {
            val user = username.text.toString()
            val pass = password.text.toString()

            // Simple input validation
            if (user.isNotEmpty() && pass.isNotEmpty()) {
                // Navigate to HomeActivity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Show error message
                Toast.makeText(this, "Please enter valid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
