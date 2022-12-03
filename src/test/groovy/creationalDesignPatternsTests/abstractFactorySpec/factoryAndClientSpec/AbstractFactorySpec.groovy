package creationalDesignPatternsTests.abstractFactorySpec.factoryAndClientSpec

import com.designpatterns.creational.abstractfactory.BankFactory
import com.designpatterns.creational.abstractfactory.bank.Bank
import spock.lang.Specification

class AbstractFactorySpec extends Specification {

    def "getBank() should return expected object with respect to passed argument"() {

        /** CAUTION: working code*/
//        given:
//        BankFactory bankFactory = new BankFactory();
//
//        when:
//        Bank bank = bankFactory.getBank("HDFC")
//
//        then:
//        "HDFC BANK" == bank.getBankName()

        /** refactored to test other kinds of arguments */
        BankFactory bankFactory = new BankFactory();
        Bank bank = bankFactory.getBank(testArgument);

        expect:
        testResult == bank.getBankName();

        where:

        testArgument || testResult
        "HDFC"       || "HDFC BANK"
        "ICICI"      || "ICICI BANK"
        "SBI"        || "SBI BANK"


    }
}
