package creationalDesignPatternsTests.factoryMethodSpec.planSpec

import com.designPatterns.creationalPatterns.factoryMethodPattern.plan.CommercialPlan
import com.designPatterns.creationalPatterns.factoryMethodPattern.plan.DomesticPlan
import com.designPatterns.creationalPatterns.factoryMethodPattern.plan.InstitutionalPlan
import com.designPatterns.creationalPatterns.factoryMethodPattern.plan.Plan
import spock.lang.Specification

class PlanTypeSpec extends Specification{



    def "getRate() should return 5.50 from Institutional Plan"(){
        given:
        Plan institutionalPlan = new InstitutionalPlan()

        when:
        institutionalPlan.getRate();
        double rate = institutionalPlan.rate;

        then:
        rate == 5.50

    }

    def "getRate() should return 3.50 from Domestic Plan"() {
        given:
        Plan domesticPlan = new DomesticPlan();

        when:
        domesticPlan.getRate();
        double rate = domesticPlan.rate;

        then:
        rate == 3.50

    }

    def "getRate() should return 7.50 from Commercial Plan"() {
        given:
        Plan commercialPlan = new CommercialPlan();

        when:
        commercialPlan.getRate();
        double rate = commercialPlan.rate;

        then:
        rate == 7.50;
    }
}
