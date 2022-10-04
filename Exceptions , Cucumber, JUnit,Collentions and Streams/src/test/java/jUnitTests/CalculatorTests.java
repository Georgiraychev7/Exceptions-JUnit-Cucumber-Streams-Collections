package jUnitTests;

import jUnit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void sumCorrectlyIntegers(){
        Assertions.assertEquals(8,Calculator.sum(3,5));
    }

    @Test
    public void verifySumOfDoublesAreNotEquals(){
        Assertions.assertNotEquals(5.2,Calculator.sum(3.0,1.2));
    }

    @Test
    public void wrongSum(){
        Assertions.assertEquals(5.2,Calculator.sum(1.2,3.0));
    }
}
