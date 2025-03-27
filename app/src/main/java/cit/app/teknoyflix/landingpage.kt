package cit.app.teknoyflix

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class landingpage : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landingpage)

        val profileButton = findViewById<Button>(R.id.profile_button)

        profileButton.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}