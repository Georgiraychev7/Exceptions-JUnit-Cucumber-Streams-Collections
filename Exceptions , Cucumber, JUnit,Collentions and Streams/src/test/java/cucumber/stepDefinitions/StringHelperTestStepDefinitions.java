package cucumber.stepDefinitions;

import cucumber.helper.StringHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringHelperTestStepDefinitions {

    private boolean caseSensitive;
    private String input;
    private String firstSentence;
    private String secondSentence;
    private String textInput;
    private String stringInput;


    @Given("^We use case (sensitive|insensitive) comparing$")
    public void caseSensitiveComparing(String option) {
        caseSensitive = option.equalsIgnoreCase("sensitive");
    }

    @When("We have a word {string}")
    public void inputWord(String string) {
        input = string;
    }

    @Then("We check {word} is equal or not to our word")
    public void comparingWords(String string) {
        assertEquals(true, StringHelper.areWordsEqual(input, string, caseSensitive));

    }

    @When("We have a sentence {string}")
    public void inputSentence(String sentence) {
        firstSentence = sentence;
        System.out.println(firstSentence);
    }

    @And("We have sentence for comparing {string}")
    public void sentenceForComparing(String secondSentenceInput) {
        secondSentence = secondSentenceInput;
    }

    @Then("Compare sentences")
    public void compareSentences() {
        assertEquals(true, StringHelper.areSentencesEqual(firstSentence, secondSentence, caseSensitive));
    }

    @When("We have the following text")
    public void weHaveText(String text) {
        textInput = text;
    }
    @Then("We count the chars in the text")
    public void countCharsInText() {
        assertEquals(54,StringHelper.getCharsCount(textInput));
    }

    @When("We have another text")
    public void weHaveAnotherText(String text) {
       textInput = text;
    }
    @Then("We count words in the text")
    public void countWords() {
        assertEquals(12,StringHelper.getWordsCountFromText(textInput));
    }

    @And("^We remove (.*) from word$")
    public void removeChar(String character) {
       input = input.replace(character,"");
    }

    @And("^We remove first ([\\(\\)\\[\\],;\\-'“])$")
    public void removeSingleSymbol(String symbol) {
        stringInput = stringInput.replaceFirst(symbol,"");
        System.out.println(stringInput);

    }
    @And("^We remove all ([\\.\\?\\!;:\",\\-'])$")
    public void removeAllSymbols(String allSymbols) {
        stringInput = stringInput.replaceAll(allSymbols,"");
    }
    @Then("We compare with {string}")
    public void compareSentences(String string) {
        input = string;
        System.out.print(input + stringInput);
        assertEquals(true,StringHelper.areSentencesEqual(input,stringInput,caseSensitive));
    }

    @Given("We have a simple text")
    public void textForRegex(String whiteSpaceText) {
        textInput = whiteSpaceText;
        System.out.println(whiteSpaceText);
    }
    @When("^We remove white space before ([,.:\\-\\?\\!])$")
    public void removeWhiteSpaceBeforeSpecialCharacter(String specialSymbol) {
        textInput = textInput.replaceAll("\\s+(?=[,\\.\\-\\?!:])","");
        System.out.println(textInput);
    }
    @When("We remove more than one consecutive whitespace chars with a single space.")
    public void removeMoreThanOneConsecutiveWhitespaceChars() {
        textInput = textInput.replaceAll("  ","");
        System.out.println(textInput);
    }
    @Then("Count the number of chars and verify output")
    public void CountTheNumberOfCharsAndVerifyOutput() {
        System.out.println(StringHelper.getCharsCount(textInput));
        assertEquals(55,StringHelper.getCharsCount(textInput));

    }

}