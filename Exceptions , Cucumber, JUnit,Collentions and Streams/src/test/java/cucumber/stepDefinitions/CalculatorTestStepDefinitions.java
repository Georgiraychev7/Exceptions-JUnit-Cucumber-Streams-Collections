package cucumber.stepDefinitions;

import cucumber.helper.CalculatorHelper;
import cucumber.helper.DifferenceCalculatorHelper;
import cucumber.helper.SumCalculatorHelper;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestStepDefinitions {


    private int actualResult;
    private CalculatorHelper calculatorHelper;
    private double actualDoubleResult;
    private final List<Integer> firstColumnNumbers = new ArrayList<>();
    private final List<Integer> secondColumnNumbers = new ArrayList<>();
    int firstColumnSum;
    int secondColumnSum;

    @ParameterType("SumCalculator|DifferenceCalculator")
    public CalculatorHelper calculatorHelper (String calculator) {
        if (calculator.equalsIgnoreCase("SumCalculator")) {
            calculatorHelper = new SumCalculatorHelper();
        } else {
            calculatorHelper = new DifferenceCalculatorHelper();
        }
        return calculatorHelper;
    }

    @When("{calculatorHelper} integer numbers {int} and {int}")
    public void sumNumbers(CalculatorHelper calculatorHelper, int number, int secondNumber) {
       actualResult = calculatorHelper.calculate(number,secondNumber);
    }
    @Then("Integer sum should be {int}")
    public void SumIntResult(int result) {
       assertEquals(actualResult,result);
        System.out.println(actualResult);
    }

    @Then("Integer difference should be {int}")
    public void integer_difference_should_be(int result) {
      assertEquals(actualResult,result);
        System.out.println(actualResult);
    }

    @When("{calculatorHelper} double numbers {double} and {double}")
    public void sumDoubleNumbers(CalculatorHelper calculatorHelper, double number, double secondNumber) {
       actualDoubleResult = calculatorHelper.calculate(number,secondNumber);
    }
    @Then("Double sum should be {double}")
    public void doubleSumResult(double result) {
        assertEquals(actualDoubleResult,5.2);
    }

    @When("{calculatorHelper} double positive numbers {double} and {double}")
    public void doubleDiffResult(CalculatorHelper calculatorHelper, double number, double secondNumber) throws Throwable{
       actualDoubleResult = calculatorHelper.calculate(number,secondNumber);
    }

    @Then("Double diff should be {double}")
    public void doubleDifResult(double result) {
       assertEquals(actualDoubleResult,3.8);
    }

    @Given("we have the following numbers:")
    public void initializeNumbersFromTable(List<List<Integer>> rows) {
        rows.forEach(column -> {
            firstColumnNumbers.add(column.get(0));
            secondColumnNumbers.add(column.get(1));
        });
    }
    @When("We use {calculatorHelper}")
    public void sumNumbersFromTable (CalculatorHelper calculatorHelper) {
        firstColumnSum = calculatorHelper.calculate(firstColumnNumbers);

        secondColumnSum = calculatorHelper.calculate(secondColumnNumbers);
    }

    @Then("Compare result")
    public void compareResults() {
        if(firstColumnSum > secondColumnSum){
            System.out.println(firstColumnSum + " is bigger than " + secondColumnSum);
        } else if(firstColumnSum < secondColumnSum){
            System.out.println(firstColumnSum + " is smaller than " + secondColumnSum);
        } else {
            System.out.println("Sum of the columns are equal");
        }
    }
    }
