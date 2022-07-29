package com.designPatterns.creationalPatterns.abstractFactoryPattern.bank;

public class ICICI implements Bank{
    private final String bankName;

    public ICICI() {
        bankName = "ICICI BANK";
    }


    @Override
    public String getBankName() {
        return bankName;
    }
}
