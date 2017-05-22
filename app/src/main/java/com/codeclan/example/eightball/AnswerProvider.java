package com.codeclan.example.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 22/05/2017.
 */

public class AnswerProvider implements AnswerProviding {

    private ArrayList<String> answers;

    // Constructor overloading here - two constructors

    public AnswerProvider(ArrayList<String> answers) {
        this.answers = answers;
    }

    public AnswerProvider() {
        this.answers = new ArrayList<>();
        setupDefaultAnswers();
    }

    private void setupDefaultAnswers() {
        String[] defaultAnswers = {
          "You bet your ass?",
          "Like, no."
        };
        for (String answer: defaultAnswers) {
            this.answers.add(answer);
        }
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>(this.answers);
    }

    public int getNumberOfAnswers() {
        return this.answers.size();
    }

    // The add here relates to the ArrayList
    // 'add' method that is in built
    public void add(String answer) {
        this.answers.add(answer);
    }

    public String getAnswerAtIndex(int i) {
        return this.answers.get(i);
    }

    public String getAnswer() {
        Random rand = new Random();
        int index = rand.nextInt(getNumberOfAnswers());
        return getAnswerAtIndex(index);
    }
}
