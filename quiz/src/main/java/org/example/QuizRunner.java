package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quiz theQuiz = new Quiz();

        Integer score = 0;
        Integer totalPoints = 0;
        for (Question item : theQuiz.getQuestionAnswerList()) {
            if (item instanceof TrueFalse) {
                totalPoints += 1;
                System.out.println("Please Type True Or False");
                System.out.println(item.getQuestion());
                String answer = input.next().toLowerCase();
                if (answer.equals(item.getAnswer())) {
                    score += 1;
                    System.out.println("You answered correctly.");
                } else {
                    System.out.println("You answered incorrectly.");
                }
            }
            if (item instanceof MultipleChoice) {
                totalPoints += 1;
                System.out.println("Multiple Choice: Please Select The Correct Answer");
                Integer number = 0;
                for (String question : ((MultipleChoice) item).getArrayQuestions()) {
                    number++;
                    System.out.println(number + " : " + question);
                }
                String answer = input.next();
                if (answer.equals(item.getAnswer())) {
                    score += 1;
                    System.out.println("You answered correctly.");
                } else {
                    System.out.println("You answered incorrectly.");
                }
            }
            if (item instanceof CheckBox) {
//               Integer length = ((CheckBox) item).getArrayAnswerKey().length;
                totalPoints += ((CheckBox) item).getArrayAnswerKey().length;
                System.out.println("Select All That Apply, Press x When Finished");
                Integer number = 0;
                for (String question2 : ((CheckBox) item).getCheckboxQuestions()) {
                    number++;
                    System.out.println(number + " : " + question2);
                }
                ArrayList<String> answers = new ArrayList<>();
                while (true) {
                    String answer = input.next();
                    if (answer.equals("x")) {
                        break;
                    }
                    answers.add(answer);
                    input.nextLine();
                }
                for (String num : ((CheckBox) item).getArrayAnswerKey()) {
                    if (answers.contains(num)) {
                        System.out.println(num + " was correct");
                        score++;
                    } else {
                        System.out.println("Your other answers were not correct");
                    }
                }
            }
        }
        Double percent = Double.valueOf((score / totalPoints) * 100);
        System.out.println(score + "/" + totalPoints + " You scored " + percent + "%");
    }
}