package com.designpatterns.structural.facadepattern.phones;

public class Samsung implements MobileShop {

    @Override
    public void modelNumber() {
        System.out.println("Samsung galaxy tab 3 ");
    }

    @Override
    public void price() {
        System.out.println("Rs 45000.00");
    }
}
