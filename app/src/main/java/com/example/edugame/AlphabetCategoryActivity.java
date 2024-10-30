package com.example.edugame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlphabetCategoryActivity extends AppCompatActivity {

    private TextView questionTextView;
    private ImageView questionImageView;
    private Button[] answerButtons = new Button[3];
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;
    private String userName;
    private MediaPlayer correctSound;
    private MediaPlayer wrongSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_category);

        // Initialize UI elements
        questionTextView = findViewById(R.id.instruction);
        questionImageView = findViewById(R.id.red);
        answerButtons[0] = findViewById(R.id.button_red);
        answerButtons[1] = findViewById(R.id.button_blue);
        answerButtons[2] = findViewById(R.id.button_yellow);

        userName = getIntent().getStringExtra("USER_NAME");
        // Load questions (replace this with your actual question loading logic)
        questions = loadQuestions();

        correctSound = MediaPlayer.create(this,R.raw.correct_clip);
        wrongSound = MediaPlayer.create(this,R.raw.incorrect_clip);
        // Show the first question
        showQuestion();

        // Set up answer button listeners
        for (int i = 0; i < answerButtons.length; i++) {
            final int index = i;
            answerButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    handleAnswerClick(index);
                }
            });
        }
    }

    // Load questions data (replace with your own implementation)
    private List<Question> loadQuestions() {
        // Sample loading method, ideally you'd fetch from a database or predefined list
        return Question.getAlphabetQuestions();
    }

    private void showQuestion() {
        if (currentQuestionIndex >= questions.size()) {
            showFinalScore();
            return;
        }

        // Get the current question
        Question currentQuestion = questions.get(currentQuestionIndex);

        // Set the question text and image
        //questionTextView.setText(currentQuestion.getImageResId());
        questionImageView.setImageResource(currentQuestion.getImageResId());

        // Shuffle and set the text of the answer buttons
        List<String> answerOptions = Arrays.asList(currentQuestion.getOptions());
        Collections.shuffle(answerOptions);  // Optional: shuffle answers to randomize positions

        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i].setText(answerOptions.get(i));
        }
    }

    private void handleAnswerClick(int selectedAnswerIndex) {
        Question currentQuestion = questions.get(currentQuestionIndex);
        String selectedAnswer = answerButtons[selectedAnswerIndex].getText().toString();

        if (selectedAnswer.equals(currentQuestion.getCorrectAnswer())) {
            // Correct answer
            score += 10;
            correctSound.start();
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();

        } else {
            // Incorrect answer
            score -= 5;
            wrongSound.start();
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_SHORT).show();

        }

        // Move to the next question
        currentQuestionIndex++;
        if (currentQuestionIndex < questions.size()) {
            showQuestion();
        } else {
            showFinalScore();
        }
    }

    private void showFinalScore() {
        Intent intent = new Intent(this, CompletionActivity.class);
        intent.putExtra("USER_NAME", userName);
        intent.putExtra("SCORE", score);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release MediaPlayer resources when the activity is destroyed
        if (correctSound != null) {
            correctSound.release();
            correctSound = null;
        }
        if (wrongSound != null) {
            wrongSound.release();
            wrongSound = null;
        }
    }
}
