package com.designpatterns.behavioral.state_pattern;

public class StatePatternDemo {
    Controller controller;

    public StatePatternDemo(String control) {
        controller = new Controller();

        if (control.equalsIgnoreCase("management")) {
            controller.setManagementConnection();
        } else if (control.equalsIgnoreCase("sales")) {
            controller.setSalesConnection();
        } else if (control.equalsIgnoreCase("accounting")) {
            controller.setAccountingConnection();
        }

        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }

    public static void main(String[] args) {
        String inputControl = "management";

        new StatePatternDemo(inputControl);
    }
}
