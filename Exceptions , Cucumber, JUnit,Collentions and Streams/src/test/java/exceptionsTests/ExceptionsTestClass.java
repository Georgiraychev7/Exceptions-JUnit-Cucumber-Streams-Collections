package exceptionsTests;

import exceptions.CupOfCoffee;
import exceptions.Person;
import exceptions.VendingMachine;
import org.junit.jupiter.api.Test;


public class ExceptionsTestClass {

    Person georgi = new Person();
    VendingMachine vendingMachine = new VendingMachine();
    CupOfCoffee lavazza = new CupOfCoffee();

    @Test
    public void testExceptions() {
        lavazza.setQuantity(1);
        vendingMachine.orderCoffee(georgi,lavazza);
    }

    @Test
    public void testExceptions2(){
        lavazza.setTemperature(100);
        vendingMachine.serveCoffee(georgi,lavazza);
    }

    @Test
    public void testExceptions3(){
        vendingMachine.finishingOrder(georgi,lavazza);
    }
}
