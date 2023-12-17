package com.designpatterns.behavioral.state_pattern;

public class Controller {
    public static Accounting accounting;
    public static Sales sales;
    public static Management management;

    private Connection connection;

    public Controller() {
        accounting = new Accounting();
        sales = new Sales();
        management = new Management();
    }

    public void setAccountingConnection() {
        connection = accounting;
    }

    public void setSalesConnection() {
        connection = sales;
    }

    public void setManagementConnection() {
        connection = management;
    }

    public void open() {
        connection.open();
    }

    public void close() {
        connection.close();
    }

    public void log() {
        connection.log();
    }

    public void update() {
        connection.update();
    }

}
