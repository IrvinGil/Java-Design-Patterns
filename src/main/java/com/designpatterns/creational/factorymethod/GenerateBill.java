package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.plan.Plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main (String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Enter the name of the plan for which the bill be generated: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String planName = bufferedReader.readLine();

        System.out.println("Enter the number of units for bill will calculated: ");
        int units = Integer.parseInt(bufferedReader.readLine());

        //pass the acquired values here >>
        Plan plan = planFactory.getPlan(planName);

        //call getRate() method and calculateBill() method of DomesticPlan
        System.out.println("Bill amount for "+ planName+" of "+units+" units is: ");
        plan.getRate();
        plan.calculateBill(units);




    }
}
