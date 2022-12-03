package com.designpatterns.structuralPattern.bridgepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaQuestions implements Question {
    private List<String> questions = new ArrayList<String>();
    private int current = 0;

    private List<String> populateList = Stream.of(
            "What is class?",
            "What is an Interface?",
            "What is Abstraction?",
            "How multiple polymorphism is achieved in java? ",
            "How many types of exception handling are there in java?",
            "Define the keyword final for variable, method, and class in Java?",
            "What is an Abstract class?",
            "What is multi-threading>"
    ).collect(Collectors.toList());

    public JavaQuestions() {
        for (String item : populateList) {
            questions.add(item);
        }
        for (String it : questions) {
            System.out.println(it);
        }

    }

    @Override
    public void nextQuestion() {
        if (current <= questions.size() - 1) {
            current++;
            System.out.println(current);
        }
    }

    @Override
    public void previousQuestion() {
        if (current > 0) {
            current--;
        }
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(String question) {
        questions.remove(question);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(current));
    }

    @Override
    public void displayAllQuestions() {
        questions.forEach(question -> {
            System.out.println(question);
        });
    }
}
