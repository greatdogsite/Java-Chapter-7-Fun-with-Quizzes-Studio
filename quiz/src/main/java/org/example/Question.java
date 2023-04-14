package org.example;

import java.util.ArrayList;

public abstract class Question {
    private ArrayList<String> questions;
    private ArrayList<String> answers;
    private String message;

    Question(ArrayList<String> aQuestions, ArrayList<String> anAnswers, String aMessage) {
        this.questions = aQuestions;
        this.answers = anAnswers;
        this.message = aMessage;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public String getMessage() {
        return message;
    }
}

