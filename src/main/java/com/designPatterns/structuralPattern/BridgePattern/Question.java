package com.designPatterns.structuralPattern.BridgePattern;

public interface Question {
    public void nextQuestion();
    public void previousQuestion();
    public void newQuestion(String question);
    public void deleteQuestion(String question);
    public void displayQuestion();
    public void displayAllQuestions();

}
