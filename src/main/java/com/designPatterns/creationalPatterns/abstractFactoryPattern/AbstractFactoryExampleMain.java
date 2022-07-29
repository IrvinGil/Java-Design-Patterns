package com.designPatterns.creationalPatterns.abstractFactoryPattern;

import com.designPatterns.creationalPatterns.abstractFactoryPattern.bank.Bank;
import com.designPatterns.creationalPatterns.abstractFactoryPattern.loan.Loan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryExampleMain {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print
                ("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = bufferedReader.readLine();
        System.out.println("\n");
        System.out.println("Enter the type of loan (e.g. home loan or business loan or education loan): ");
        String loanName = bufferedReader.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);
        System.out.println("\n");

        System.out.println("Enter the interest rate for "+bank.getBankName()+": ");
        double rate = Double.parseDouble(bufferedReader.readLine());
        System.out.println("\n");

        System.out.println("Enter the loan amount you want to take: ");

        double loanAmount = Double.parseDouble(bufferedReader.readLine());
        System.out.println("\n");
        System.out.println("Enter the number of years to pay your entire loan amount: ");

        int years = Integer.parseInt(bufferedReader.readLine());
        System.out.println("\n");
        System.out.println("You are taking the loan from " + bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(loanAmount,years);



    }
}
