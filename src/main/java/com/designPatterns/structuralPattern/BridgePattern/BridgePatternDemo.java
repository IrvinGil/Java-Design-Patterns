package com.designPatterns.structuralPattern.BridgePattern;

public class BridgePatternDemo {
    public static void main(String args[]) {
        QuestionFormat questionFormat = new QuestionFormat("Java Programming Language");
        questionFormat.question = new JavaQuestions();
        questionFormat.delete("What is class?");
        questionFormat.display();
        questionFormat.newQuestion("What is inheritance?");

        questionFormat.newQuestion("How many types of inheritance are there in java?");
        questionFormat.displayAll();
    }
}
