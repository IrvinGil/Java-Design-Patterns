package com.designpatterns.structural.proxypattern;

public class ProxyPatternClientDemoMain {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
    }
}
