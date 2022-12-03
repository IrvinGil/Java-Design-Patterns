package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.bank.Bank;
import com.designpatterns.creational.abstractfactory.loan.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
