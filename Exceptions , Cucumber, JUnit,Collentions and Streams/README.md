# Repository name: Training Repo
The purpouse of this repo is to store all projects from my training program 

# Project Exceptions Handling

- Learn about Exceptions - checked, unchecked, hiearachy
- Learn how to create custome exception
- Learn about Exception handling - try, catch, finally, try with resources
- Learn about re-throwing exception - "throw", "throws"
- Work with exceptions and exception hangling

Practical task: 
Create custom checked exception class - On some of the methods in class Order 
(method X) mark that they will throw that custom exception (in the method signature) 
- From another method, call X and handle the exception - From another method call X and re-throw the exception 
- From some method in class Order throw the custom exception - Clear resources in the finally block 
- Catch multiple exceptions - Catch the top level exception (Throwable) - Use try with resources on some of the methods of the Order class

# Project : JUnit basics 

Goals:

Learn about:

What is Junit

Annotations for Test, Before, After

Assertions and Assumptions

How to write Junit test

Junit reports

Parametrized tests 

Practice:

By using the maven project create branch called Junit

Add tests for simple numeric operation

upload the tests to github

Parameterized Test : 

Create test to pass numbers parameters

Create test to pass String parameters

Create test to read from CSV strucutre in the method and another test to read data from CSV file.
(take a look on the examples from the resources for Parameterized Tests)

   
# Project name: Cucumber
The purpose of this project is to learn about BDD and Cucumber.

Theory:

BDD

What is BDD?
What are the pros and cons of BDD?
What are the BDD best practices?
Cucumber:

What is Cucumber and when to use it? What problems Cucumber solves?
What are the framework’s best practices?
How Cucumber works?
How to configure a Cucumber project? How is a cucumber project structured?
Practical task:

To configure and setup a simple Java HelloWorld automation project with Maven, Cucumber and JUnit5 by folloing the below steps:

IntelliJ with installed "Cucumber for Java" and "Gherkin" plugins
"cucumber-training" Java Maven Project with Cucumber and JUnit5 created and pushed to GitHub repository " CucumberTraining".
Tests can be started from TestRunner.java - JUnit Cucumber Test Runner Class.
Implement a HelloWorld feature with 1 successfully running Scenario with a single step that prints "Hello World!" to the console.
The step definition for the scenario is created in a HelloWorldSteps.java
How to run the test?

# Numeric Expression 

Theory:

Numeric expressions - {int}, {float}, {bigdecimal}, {double}, {biginteger}, {byte}, {short}, {long}

Custom Parameter types

Optional text

Creating step definitions with standard Java methods (next chapter we will cover Java Lambdas)

Strategy design pattern

Practical tasks:

Verify the calculation of numbers 
Description: Implement Cucumber tests that verify the output from the attached calculator helper classes. Scenarios should be separated by a Rule for Integers and Decimals or a Rule for the calculator type (sum or difference).  Using a custom parameter set the appropriate calculator - for sum or difference. There is no need to test all available methods.
Compare two columns with numbers

Description: Implement a Cucumber scenario with a step that accepts a Data table of  two columns with numbers. Using the attached calculator helpers perform the target calculations by column. Using a custom parameter set the appropriate calculator - for sum or difference

Example 1: sum all the numbers in the first column and sum all the numbers in the second column. 

Example 2: calculate the difference of all the numbers in the first column and calculate the difference of all the numbers in the second column. 

Verify which  column has the bigger calculation.

Acceptance criteria:

Test scenarios are running and are implemented as per definitions above. 

Trainee understands and has used Numeric expressions in the implemented tests.

Trainee understands and has used Custom parameter types and Optional text in the implemented tests.

Trainee is able to map Cucumber scenarios to step definitions with numeric expressions.

Specific group or sub-group (suite) of tests can be executed through the JUnit Cucumber Test Runner class.

# Regular Expression
Theory:

Cucumber with RegEx

Escaping special characters from step definitions and methods

Practical tasks:

Extend compare words tests

Description:  Extend the existing tests for comparing words with additional steps that remove some characters. Implement steps that:

accepts only a single alphabet letter and removes the first occurrence from the first input word. Applies for letters a-z and A-Z. 

accepts any digit and removes all occurrences from the first input word

Example test flow:

input word is Cucumberss11

I remove s

I remove 1

second input word is cucumbers

I verify that words are the same (test passes or fails depending on the case sensitivity)

Extend compare sentences tests

Description: Extend the existing tests for comparing sentences with additional steps that remove certain characters. Implement steps that:

accept only one of the following as input ( ) [ ] { } : and removes the first occurrence from the first sentence.

accept only one of the following as input . ? ! ; : “ , - '  as input parameter and removes all occurrences from the first sentence.

Example test flow:

first input sentence is I am testing with RegEx ((it’s working??!!!)

I remove (

I remove ?

second input t sentence is i am testing with regex (it’s working!!!)

I verify that sentences are the same (test passes or fails depending on the case sensitivity)

Extend word and char count tests

Description: currently our StringHelper is not returning us the correct word count. To count the words, StringHelper splits the text by spaces and returns the count. If we have multiple spaces or a dash surrounded by spaces, the data count is treating them as additional words. Example: I am testing   whitespaces - is the count correct? has to return 8 words, but returns more because of white spaces.

Add a step that removes all whitespace chars before , . - ? ! : symbols 

Add a step that removes more than one consecutive whitespace chars with a single space.

Acceptance criteria:

As a trainee, 

I understand and I have used Cucumber wtih RegEx

I know how to escape special characters from step definitions and methods
