package com.designpatterns.creational.abstractfactory.loan;

public class HomeLoan extends Loan {
    @Override
    public void getInterestRate(double inputRate) {
        rate = inputRate;
        //TODO: you are free to do different implementations of how the interest rate
        // is computed per type of loan
    }


}
