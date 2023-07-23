package com.designpatterns.structural.adapterpattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// This is the Adapter Class
public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name: ");
            String customerName = br.readLine();
            System.out.print("\n");

            System.out.print("Enter account number: ");
            long accountNumber = Long.parseLong(br.readLine());
            System.out.println("\n");

            System.out.print("Enter the bank name: ");
            String bankName = br.readLine();

            setAccountHolderName(customerName);
            setAccountNumber(accountNumber);
            setBankName(bankName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accountNumber = getAccountNumber();
        String accountHolderName = getAccountHolderName();
        String bankName = getBankName();

        return String.format("The Account number %s of %s in %s bank is valid and authenticated for using the credit card.", accountNumber, accountHolderName, bankName);
    }
}
