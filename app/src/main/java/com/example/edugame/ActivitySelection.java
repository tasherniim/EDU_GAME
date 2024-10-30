package com.example.edugame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class ActivitySelection extends AppCompatActivity {

    private ImageButton alphabetButton;
    private ImageButton numbersButton;
    private ImageButton colorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_selection);

        alphabetButton = findViewById(R.id.alphabet_button);
        numbersButton = findViewById(R.id.numbers_button);
        colorsButton = findViewById(R.id.colours_button);

        // Get user name from intent
        String userName = getIntent().getStringExtra("USER_NAME");

        // Set up click listeners
        alphabetButton.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySelection.this, AlphabetCategoryActivity.class);
            intent.putExtra("USER_NAME", userName);
            startActivity(intent);
        });

        numbersButton.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySelection.this, NumbersCategoryActivity.class);
            intent.putExtra("USER_NAME", userName);
            startActivity(intent);
        });

        colorsButton.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySelection.this, ColoursCategoryActivity.class);
            intent.putExtra("USER_NAME", userName);
            startActivity(intent);
        });
    }
}
