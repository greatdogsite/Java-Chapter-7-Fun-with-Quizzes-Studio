package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quiz theQuiz = new Quiz();

        Integer score = 0;
        Integer totalPoints = 0;
        for (Question questions : theQuiz.getAllQuestions()) {
            String inputAnswer;
            Integer num = 0;
            if (questions instanceof Checkbox) {
                System.out.println(questions.getMessage());
                for (String question : questions.getQuestions()) {
                    num++;
                    System.out.println(num + " : " + question);
                }
                totalPoints += questions.getAnswers().toArray().length;
                ArrayList<String> inputAnswers = new ArrayList<>();
                while (true) {
                    String answer = input.next();
                    if (answer.equals("x")) {
                        break;
                    }
                    inputAnswers.add(answer);
                    input.nextLine();
                }
                for (String answer : questions.getAnswers()) {
                    if (inputAnswers.contains(answer)) {
                        System.out.println(answer + " was correct");
                        score++;
                    } else {
                        System.out.println("Your other answers were not correct");
                    }
                }
            } else {
                System.out.println(questions.getMessage());
                for (String question : questions.getQuestions()) {
                    num++;
                    System.out.println(num + " : " + question);
                }
                totalPoints += questions.getAnswers().toArray().length;
                inputAnswer = input.next().toLowerCase();
                for (String answer : questions.getAnswers()) {
                    if (answer.equals(inputAnswer)) {
                        score++;
                        System.out.println("You answered correctly.\n");
                    } else {
                        System.out.println("You answered incorrectly.\n");
                    }
                }
            }
        }
        Double percent = Double.valueOf((score / totalPoints) * 100);
        System.out.println(score + "/" + totalPoints + " You scored " + percent + "%");
    }
}