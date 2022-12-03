package com.designpatterns.creational.abstractfactory.loan;

public abstract class Loan {
    protected double rate;

    public abstract void getInterestRate(double inputRate);

    public void calculateLoanPayment(double loanAmount, int years) {
        /**TODO:
         * to calculate the monthly loans payment i.e EMI
         *
         * rate = annual interest rate/12*100
         * n = number of monthly installments
         * 1 yest = 12 months
         * So, n = years * 12*/

        double EMI;
        int numberOfMonthlyInstallments = years * 12;
        rate = rate / (12 * 100);

        EMI = ((rate * Math.pow((1 + rate), numberOfMonthlyInstallments))
                / ((Math.pow((1 + rate), numberOfMonthlyInstallments)) - 1)) * loanAmount;

        System.out.println("your monthly EMI is " + EMI + " for the amount" +
                loanAmount + " you have borrowed");

        /**
         * NOTE: for this example, the advantages of this design pattern is that:
         * you are free to adjust the different ways of calculation the INTEREST RATE per type
         * of LOAN. Freeing each type of loan from the tight coupling.
         * */
    }
}
