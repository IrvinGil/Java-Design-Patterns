package com.designpatterns.structuralPattern.adapterpattern;


// This is the client class
public class AdapterPatternDemoMain {
    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.println(targetInterface.getCreditCard());


    }

}
