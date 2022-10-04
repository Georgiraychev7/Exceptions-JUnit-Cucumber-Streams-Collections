package jUnitTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10, 13})
    public void isEvenNumber(int number) {
        Assertions.assertTrue(number % 2 == 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ponedelnik", "Vtornik", "Srqda", "Chetvurtuk", "Petuk"})
    public void compareStrings(String dayOfWeek) {
        Assertions.assertTrue(dayOfWeek.equalsIgnoreCase("pOnEdelnik"));
    }

    @ParameterizedTest
    @CsvSource({"apple,ApplE", "banana,bAnANa", "PineAPle, pineaplE"})
    void compareStringsWithCsv(String input, String secondInput) {
        String actualInput = input.toLowerCase();
        String compareInput = secondInput.toLowerCase();
        Assertions.assertEquals(actualInput, compareInput);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/CsvForTesting.csv", numLinesToSkip = 1)
    public void compareStringsFromCsvFileSource(String input, String expected){
        String monthInput = input.toUpperCase();
        Assertions.assertEquals(monthInput,expected);
    }
}
