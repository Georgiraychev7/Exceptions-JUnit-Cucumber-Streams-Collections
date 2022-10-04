Feature: This feature will test String Helper class

  Background:
    Given We use case insensitive comparing

    @StringHelper
    Scenario Outline: Test for comparing words
      When We have a word "Cucumberss11"
      And We remove s from word
      And We remove 1 from word
      Then We check <second_word> is equal or not to our word

      Examples:
      |second_word|
      |cucumber   |

    @StringHelper
    Scenario: Comparing sentences
      When We have a sentence "Cucumber is amazing!"
      And  We have sentence for comparing "cucumber is amazing!"
      Then Compare sentences

      @StringHelper
      Scenario: Count chars in text
        When We have the following text
        """
        This text is with testing purpose for counting chars !
        """
        Then We count the chars in the text
        When We have another text
        """
        In this text we will count the number of the words !
        """
        Then We count words in the text

        @RegularExpression
        Scenario: Accept only one of the following as input ( ) [ ] { } : and removes the first occurrence from the first sentence.
          When We have a sentence "I am testing with RegEx ((it’s working??!!!)"
          And  We remove first (
          And  We remove all ?
          Then We compare with " i am testing with regex (it’s working!!!)"

          @RegularExpression
          Scenario: Try to remove white space before special character and more than one consecutive whitespace chars with a single space.
            Given We have a simple text
            """
            Here we are trying - to remove white : spaces   with regex !
            """
            When  We remove white space before ?
            And   We remove more than one consecutive whitespace chars with a single space.
            Then  Count the number of chars and verify output
