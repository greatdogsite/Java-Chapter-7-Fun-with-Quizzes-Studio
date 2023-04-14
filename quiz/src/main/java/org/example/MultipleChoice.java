package org.example;

import java.util.*;

public class MultipleChoice extends Question {
    private ArrayList<String> arrayQuestions;
    private String answer;

    MultipleChoice(ArrayList<String> arrayQuestions, String anAnswer) {
        super();
        this.arrayQuestions = arrayQuestions;
        this.answer = anAnswer;
    }

    public ArrayList<String> getArrayQuestions() {
        return this.arrayQuestions;
    }

    public String getAnswer() {
        return answer;
    }

}
