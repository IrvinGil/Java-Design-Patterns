package com.designpatterns.structural.facadepattern.phones;

public class Blackberry implements MobileShop {

    @Override
    public void modelNumber() {
        System.out.println("Blackberry Z10");
    }

    @Override
    public void price() {
        System.out.println("Rs 55000.00");
    }
}
