package cit.app.teknoyflix

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameInput = findViewById<EditText>(R.id.Email)
        val emailInput = findViewById<EditText>(R.id.Email)
        val passwordInput = findViewById<EditText>(R.id.Password)
        val loginButton = findViewById<Button>(R.id.Login_button)

        loginButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            // Direct validation and navigation logic
            if (username == "admin@gmail.com" && Patterns.EMAIL_ADDRESS.matcher(email).matches() && password == "123") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                // Navigate to LandingActivity
                val intent = Intent(this, landingpage::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid username, email, or password.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}