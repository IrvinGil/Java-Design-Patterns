package creationalDesignPatternsTests.factoryMethodSpec

import com.designpatterns.creational.factorymethod.GetPlanFactory
import com.designpatterns.creational.factorymethod.plan.CommercialPlan
import com.designpatterns.creational.factorymethod.plan.DomesticPlan
import com.designpatterns.creational.factorymethod.plan.InstitutionalPlan
import com.designpatterns.creational.factorymethod.plan.Plan
import spock.lang.Specification

class FactoryMethodSpec extends Specification {
    GetPlanFactory planFactory = new GetPlanFactory();


    def "getRate() should return 5.50 from Institutional Plan"() {
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

    def "getPlan() should return the rate according to the type of plan passed"() {


        when:
        Plan plan = planFactory.getPlan("domesticplan");
        plan.getRate();
        double testResult = plan.rate;

        then:
        3.50 == testResult;

    }

    def "getPlan() should return the rate according to the type of plan passed!!"() {
        Plan plan = planFactory.getPlan(testPlan);
        plan.getRate();

        expect:
        testResult == plan.rate;

        where:
        testPlan            || testResult
        "domesticplan"      || 3.50
        "institutionalplan" || 5.50
        "commercialplan"    || 7.50
    }

    def "calculateBIll() should print the expected calculated value"() {
        given:
        Plan plan = Mock();       //Caution: this is a code block, commented for refactoring purposes
        plan.rate = 1;

        when:
        plan.calculateBill(1);

        then:
        System.out.println(1);

    }
}
