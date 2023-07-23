package com.designpatterns.structural.bridgepattern;

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

    public void newQuestion(String question){
        this.question.newQuestion(question);
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
