package com.designpatterns.structural.proxypattern;


public class RealInternetAccess implements OfficeInternetAccess {
    private final String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee:" + employeeName);
    }
}
