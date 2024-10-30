package com.example.edugame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {
    private final int imageResId;
    private final String[] options;
    private final String correctAnswer;

    public Question(int imageResId, String[] options, String correctAnswer) {
        this.imageResId = imageResId;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Getters
    public int getImageResId() {
        return imageResId;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    // Alphabet questions
    public static List<Question> getAlphabetQuestions() {
        List<Question> alphabetQuestions = new ArrayList<>();
        alphabetQuestions.add(new Question(R.drawable.apple, new String[]{"A", "B", "C"}, "A"));
        alphabetQuestions.add(new Question(R.drawable.ball, new String[]{"A", "B", "C"}, "B"));
        alphabetQuestions.add(new Question(R.drawable.cat, new String[]{"A", "B", "C"}, "C"));
        alphabetQuestions.add(new Question(R.drawable.dog, new String[]{"D", "B", "C"}, "D"));
        alphabetQuestions.add(new Question(R.drawable.elephant, new String[]{"A", "E", "C"}, "E"));
        alphabetQuestions.add(new Question(R.drawable.fish, new String[]{"F", "B", "C"}, "F"));
        alphabetQuestions.add(new Question(R.drawable.giraffe, new String[]{"C", "G", "T"}, "G"));
        alphabetQuestions.add(new Question(R.drawable.heli, new String[]{"H", "A", "V"}, "H"));
        alphabetQuestions.add(new Question(R.drawable.ice_cream, new String[]{"I", "C", "V"}, "I"));
        alphabetQuestions.add(new Question(R.drawable.jam, new String[]{"S", "J", "B"}, "J"));
        alphabetQuestions.add(new Question(R.drawable.kangaroo, new String[]{"K", "M", "R"}, "K"));
        alphabetQuestions.add(new Question(R.drawable.lion, new String[]{"T", "C", "L"}, "L"));
        alphabetQuestions.add(new Question(R.drawable.milk, new String[]{"M", "B", "C"}, "M"));
        alphabetQuestions.add(new Question(R.drawable.nest, new String[]{"B", "N", "W"}, "N"));
        alphabetQuestions.add(new Question(R.drawable.orange, new String[]{"F", "T", "O"}, "O"));
        alphabetQuestions.add(new Question(R.drawable.pencil, new String[]{"P", "E", "M"}, "P"));
        alphabetQuestions.add(new Question(R.drawable.queen, new String[]{"E", "Q", "P"}, "Q"));
        alphabetQuestions.add(new Question(R.drawable.rabbit, new String[]{"C", "R", "T"}, "R"));
        alphabetQuestions.add(new Question(R.drawable.sun, new String[]{"M", "F", "S"}, "S"));
        alphabetQuestions.add(new Question(R.drawable.tiger, new String[]{"C", "T", "L"}, "T"));
        alphabetQuestions.add(new Question(R.drawable.unicorn, new String[]{"U", "H", "C"}, "U"));
        alphabetQuestions.add(new Question(R.drawable.van, new String[]{"B", "V", "C"}, "V"));
        alphabetQuestions.add(new Question(R.drawable.whale, new String[]{"W", "F", "G"}, "W"));
        alphabetQuestions.add(new Question(R.drawable.xylophone, new String[]{"R", "X", "C"}, "X"));
        alphabetQuestions.add(new Question(R.drawable.yogurt, new String[]{"Y", "V", "A"}, "Y"));
        alphabetQuestions.add(new Question(R.drawable.zebra, new String[]{"Z", "X", "V"}, "Z"));
        return alphabetQuestions;
    }

    // Colors questions
    public static List<Question> getColoursQuestions() {
        List<Question> coloursQuestions = new ArrayList<>();
        coloursQuestions.add(new Question(R.drawable.colourred, new String[]{"RED", "BLUE", "YELLOW"}, "RED"));
        coloursQuestions.add(new Question(R.drawable.colourblue, new String[]{"BLUE", "PINK", "BLACK"}, "BLUE"));
        coloursQuestions.add(new Question(R.drawable.colouryellow, new String[]{"ORANGE", "YELLOW", "GREEN"}, "YELLOW"));
        coloursQuestions.add(new Question(R.drawable.colourgreen, new String[]{"GREEN", "PINK", "WHITE"}, "GREEN"));
        coloursQuestions.add(new Question(R.drawable.colourpink, new String[]{"PURPLE", "BLUE", "PINK"}, "PINK"));
        coloursQuestions.add(new Question(R.drawable.colourorange, new String[]{"ORANGE", "GREEN", "YELLOW"}, "ORANGE"));
        coloursQuestions.add(new Question(R.drawable.colourpurple, new String[]{"RED", "PURPLE", "PINK"}, "PURPLE"));
        coloursQuestions.add(new Question(R.drawable.colourgray, new String[]{"WHITE", "BLACK", "GRAY"}, "GRAY"));
        coloursQuestions.add(new Question(R.drawable.colourbrown, new String[]{"BLACK", "BROWN", "WHITE"}, "BROWN"));
        coloursQuestions.add(new Question(R.drawable.colourwhite, new String[]{"ORANGE", "BLUE", "WHITE"}, "WHITE"));
        coloursQuestions.add(new Question(R.drawable.colourblack, new String[]{"BLACK", "PURPLE", "RED"}, "BLACK"));
        // Add more color questions here as needed
        return coloursQuestions;
    }

    // Numbers questions
    public static List<Question> getNumbersQuestions() {
        List<Question> numbersQuestions = new ArrayList<>();
        numbersQuestions.add(new Question(R.drawable.one, new String[]{"1", "2", "3"}, "1"));
        numbersQuestions.add(new Question(R.drawable.two, new String[]{"2", "1", "3"}, "2"));
        numbersQuestions.add(new Question(R.drawable.three, new String[]{"1", "3", "4"}, "3"));
        numbersQuestions.add(new Question(R.drawable.four, new String[]{"4", "5", "3"}, "4"));
        numbersQuestions.add(new Question(R.drawable.five, new String[]{"4", "2", "5"}, "5"));
        numbersQuestions.add(new Question(R.drawable.six, new String[]{"1", "6", "7"}, "6"));
        numbersQuestions.add(new Question(R.drawable.seven, new String[]{"8", "7", "6"}, "7"));
        numbersQuestions.add(new Question(R.drawable.eight, new String[]{"8", "7", "9"}, "8"));
        numbersQuestions.add(new Question(R.drawable.nine, new String[]{"7", "6", "9"}, "9"));
        numbersQuestions.add(new Question(R.drawable.ten, new String[]{"10", "11", "8"}, "10"));
        numbersQuestions.add(new Question(R.drawable.eleven, new String[]{"12", "11", "10"}, "11"));
        numbersQuestions.add(new Question(R.drawable.twelve, new String[]{"12", "10", "13"}, "12"));
        numbersQuestions.add(new Question(R.drawable.thirteen, new String[]{"10", "13", "8"}, "13"));
        numbersQuestions.add(new Question(R.drawable.fourteen, new String[]{"12", "13", "14"}, "14"));
        numbersQuestions.add(new Question(R.drawable.fifthteen, new String[]{"15", "10", "12"}, "15"));
        numbersQuestions.add(new Question(R.drawable.sixthteen, new String[]{"12", "16", "13"}, "16"));
        numbersQuestions.add(new Question(R.drawable.seventeen, new String[]{"10", "17", "18"}, "17"));
        numbersQuestions.add(new Question(R.drawable.eighteen, new String[]{"11", "12", "18"}, "18"));
        numbersQuestions.add(new Question(R.drawable.nineteen, new String[]{"19", "10", "15"}, "19"));
        numbersQuestions.add(new Question(R.drawable.twenty, new String[]{"11", "21", "20"}, "20"));

        // Add more number questions here as needed
        return numbersQuestions;
    }
}
