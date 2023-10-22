package com.designpatterns.structural.proxypattern;


public class ProxyInternetAccess implements OfficeInternetAccess {
    private final String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        } else {
            System.out.println("No internet access granted. Your job is below 5");
        }
    }

    public int getRole(String emplName) {
        // Check role from the database based on Name and designation
        // return job level or job designation.
        return 3;
    }
}
