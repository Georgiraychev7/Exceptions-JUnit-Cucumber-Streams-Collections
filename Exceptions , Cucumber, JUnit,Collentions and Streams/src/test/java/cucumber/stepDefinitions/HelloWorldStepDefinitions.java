package cucumber.stepDefinitions;

import io.cucumber.java.en.Given;


public class HelloWorldStepDefinitions {

    @Given("Print Hello World in the console")
    public void printHelloWorld(){
        System.out.println("Hello World!");
    }
}
