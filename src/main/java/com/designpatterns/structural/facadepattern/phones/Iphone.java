package com.designpatterns.structural.facadepattern.phones;

public class Iphone implements MobileShop {

    @Override
    public void modelNumber() {
        System.out.println("Iphone 6");
    }

    @Override
    public void price() {
        System.out.println(" Rs 65000.00");
    }
}
