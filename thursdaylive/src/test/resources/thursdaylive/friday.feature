Feature: Is it Friday

  Scenario Outline: Friday test
    Given I see that the day is <day>
    When I call the method
    Then I get the correct <response>


    Examples:
      |    day          |   response      |
      |    Friday       |       Yaay      |
      |    Thursday     |       Nope      |
      |    Monday       |       Nope      |