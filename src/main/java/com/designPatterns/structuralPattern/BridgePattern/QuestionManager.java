package com.designPatterns.structuralPattern.BridgePattern;

import com.designPatterns.structuralPattern.BridgePattern.Question;

public class QuestionManager {
    protected Question question;
    public String catalog;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
    }

    public void next() {
        question.nextQuestion();
    }

    public void previous() {
        question.previousQuestion();
    }

    public void newQuestion(String que){
        question.newQuestion(que);
    }

    public void delete(String passThisQuestion) {
        question.deleteQuestion(passThisQuestion);
    }

    public void display(){
        question.displayQuestion();
    }

    public void displayAll(){
        System.out.println("Question Paper: "+ catalog);
        question.displayAllQuestions();
    }
}
