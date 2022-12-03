package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.bank.Bank;
import com.designpatterns.creational.abstractfactory.loan.BusinessLoan;
import com.designpatterns.creational.abstractfactory.loan.EducationLoan;
import com.designpatterns.creational.abstractfactory.loan.HomeLoan;
import com.designpatterns.creational.abstractfactory.loan.Loan;

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
