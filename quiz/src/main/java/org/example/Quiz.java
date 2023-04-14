package org.example;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questionAnswerList = new ArrayList<>();

    Quiz() {
        TrueFalse question1 = new TrueFalse("The sky is red.", "false");
        this.questionAnswerList.add(question1);

        ArrayList<String> arrayQuestions = new ArrayList<>();
        arrayQuestions.add("red is red");
        arrayQuestions.add("blue is black");
        arrayQuestions.add("green is yellow");

        String answer = "1";
        MultipleChoice question2 = new MultipleChoice(arrayQuestions, answer);
        this.questionAnswerList.add(question2);

        ArrayList<String> checkboxQuestions = new ArrayList<>();
        checkboxQuestions.add("i like computers");
        checkboxQuestions.add("we like computers");
        checkboxQuestions.add("what is a computer?");

        String[] arrayAnswerKey = {"1", "2"};
        CheckBox question3 = new CheckBox(checkboxQuestions, arrayAnswerKey);
        this.questionAnswerList.add(question3);
        
    }

    public ArrayList<Question> getQuestionAnswerList() {
        return questionAnswerList;
    }
}
