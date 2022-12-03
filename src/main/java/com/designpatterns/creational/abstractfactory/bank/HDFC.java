package com.designpatterns.creational.abstractfactory.bank;

public class HDFC implements Bank{
    private final String bankName;

    public HDFC() {
        bankName = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
