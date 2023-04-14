package org.example;

public abstract class Question {
    private String question;
    private String answer;

    Question(String aQuestion, String anAnswer) {
        this.question = aQuestion;
        this.answer = anAnswer;
    }

    Question(String aQuestion) {
        this.question = aQuestion;
    }

    Question() {
        //
    }

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }
}

