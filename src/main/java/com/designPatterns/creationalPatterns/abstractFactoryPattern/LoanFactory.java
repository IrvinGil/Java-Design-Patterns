package com.designPatterns.creationalPatterns.abstractFactoryPattern;

import com.designPatterns.creationalPatterns.abstractFactoryPattern.bank.Bank;
import com.designPatterns.creationalPatterns.abstractFactoryPattern.loan.BusinessLoan;
import com.designPatterns.creationalPatterns.abstractFactoryPattern.loan.EducationLoan;
import com.designPatterns.creationalPatterns.abstractFactoryPattern.loan.HomeLoan;
import com.designPatterns.creationalPatterns.abstractFactoryPattern.loan.Loan;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }

        if (loan.equalsIgnoreCase("Home")) {
            return new HomeLoan();
        } else if (loan.equalsIgnoreCase("Business")) {
            return new BusinessLoan();
        } else if (loan.equalsIgnoreCase("Education")) {
            return new EducationLoan();
        }


        return null;
    }
}
