package com.example.edugame

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CompletionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_completion)

        val userName = intent.getStringExtra("USER_NAME")
        val score = intent.getIntExtra("SCORE", 0)

        val completionMessage = findViewById<TextView>(R.id.congratulations_text)
        completionMessage.text = "CONGRATS, $userName! YOUR FINAL SCORE IS $score."
    }
}
