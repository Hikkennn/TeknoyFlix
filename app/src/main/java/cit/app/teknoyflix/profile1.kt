package cit.app.teknoyflix

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile1 : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val logoutButton = findViewById<Button>(R.id.Logout)

        logoutButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Logout")
                .setMessage("Are you sure you want to logout??")
                .setPositiveButton("Yes") { _, _ ->
                    val intent = Intent(this, Login::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("No", null)
                .show()
        }
    }
}