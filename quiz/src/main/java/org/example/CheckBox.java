package org.example;

import java.util.ArrayList;

public class CheckBox extends Question {
    private ArrayList<String> checkboxQuestions;
    private String[] arrayAnswerKey;

    CheckBox(ArrayList<String> aCheckboxQuestions, String[] aArrayAnswerKey) {
        super();
        this.checkboxQuestions = aCheckboxQuestions;
        this.arrayAnswerKey = aArrayAnswerKey;
    }

    public ArrayList<String> getCheckboxQuestions() {
        return checkboxQuestions;
    }

    public String[] getArrayAnswerKey() {
        return arrayAnswerKey;
    }

}
