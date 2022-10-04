Feature: Test Numeric Expressions

  @Calculator
  Rule: Integer calculator tests
    Scenario: Summarize two positive integers
      When SumCalculator integer numbers 3 and 5
      Then Integer sum should be 8

  @Calculator
    Scenario: Difference two positive integers
      When DifferenceCalculator integer numbers 10 and 6
      Then Integer difference should be 4

  @Calculator
  Rule: Double calculator test
    Scenario: Summarize two positive double numbers
      When SumCalculator double numbers 1.2 and 3.0
      Then Double sum should be 5.2

  @Calculator
    Scenario: Difference two positive double numbers
      When DifferenceCalculator double positive numbers 7.5 and 2.5
      Then Double diff should be 3.8

@DataTableTest
    Rule: Data table tests
      Scenario: Calculate sum numbers
        Given we have the following numbers:
          | 3  | 2  |
          | 1  | 3  |
        When We use SumCalculator
        Then Compare result

  @DataTableTest
  Scenario: Calculate diff numbers
    Given we have the following numbers:
      | 5  | 6  |
      | 1  | 3  |
    When We use DifferenceCalculator
    Then Compare result