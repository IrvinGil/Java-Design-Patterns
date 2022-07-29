package com.designPatterns.creationalPatterns.factoryMethodPattern;

import com.designPatterns.creationalPatterns.factoryMethodPattern.plan.CommercialPlan;
import com.designPatterns.creationalPatterns.factoryMethodPattern.plan.DomesticPlan;
import com.designPatterns.creationalPatterns.factoryMethodPattern.plan.InstitutionalPlan;
import com.designPatterns.creationalPatterns.factoryMethodPattern.plan.Plan;

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
