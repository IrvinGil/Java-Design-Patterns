package com.designPatterns.creationalPatterns.abstractFactoryPattern;

import com.designPatterns.creationalPatterns.abstractFactoryPattern.bank.Bank;
import com.designPatterns.creationalPatterns.abstractFactoryPattern.loan.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
