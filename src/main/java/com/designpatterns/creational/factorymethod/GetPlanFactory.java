package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.plan.CommercialPlan;
import com.designpatterns.creational.factorymethod.plan.DomesticPlan;
import com.designpatterns.creational.factorymethod.plan.InstitutionalPlan;
import com.designpatterns.creational.factorymethod.plan.Plan;

public class GetPlanFactory {
    //use getPlan method to get object type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
