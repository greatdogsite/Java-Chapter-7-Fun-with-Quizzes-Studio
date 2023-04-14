package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> allQuestions = new ArrayList<>();

    Quiz() {
        ArrayList<String> questions = new ArrayList<>();
        ArrayList<String> answers = new ArrayList<>();

        String message = "Please Type True or False";
        questions.add("The sky is red.");
        answers.add("false");

        TrueFalse question1 = new TrueFalse(questions, answers, message);
        this.allQuestions.add(question1);


        questions = new ArrayList<>();
        answers = new ArrayList<>();

        message = "Which Of The Following Is True";
        questions.add("red is red");
        questions.add("blue is black");
        questions.add("green is yellow");
        answers.add("1");

        MultipleChoice question2 = new MultipleChoice(questions, answers, message);
        this.allQuestions.add(question2);

        questions = new ArrayList<>();
        answers = new ArrayList<>();

        message = "Select The Following That Are True. Enter x to Submit";
        questions.add("i like computers");
        questions.add("we like computers");
        questions.add("what is a computer?");
        answers.add("1");
        answers.add("2");

        Checkbox question3 = new Checkbox(questions, answers, message);
        this.allQuestions.add(question3);

    }

    public ArrayList<Question> getAllQuestions() {
        return allQuestions;
    }
}
