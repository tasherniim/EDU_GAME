package com.example.edugame

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NameInputActivity : AppCompatActivity() {
    private lateinit var nameEditText: EditText
    private lateinit var submitNameButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_input)

        // Initialize views with findViewById
        nameEditText = findViewById(R.id.nameEditText)
        submitNameButton = findViewById(R.id.submitNameButton)

        // Set click listener on the submit button
        submitNameButton.setOnClickListener {
            val userName = nameEditText.text.toString().trim()
            if (userName.isNotEmpty()) {
                // Pass the name to the next activity
                val intent = Intent(this@NameInputActivity, ActivitySelection::class.java)
                intent.putExtra("USER_NAME", userName)
                startActivity(intent)
            } else {
                // Show a toast if the name field is empty
                Toast.makeText(this@NameInputActivity, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
