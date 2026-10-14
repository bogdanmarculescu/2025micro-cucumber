Feature: Friday
  Everybody wants to know if it's Friday already

  Scenario Outline: Today is (or is not) Friday
    Given today is <day>
    When I ask whether it's Friday yet
    Then I should be told <answer>

  Examples:
    | day             | answer      |
    | Friday          | TGIF        |
    | Monday          | Nope        |
    | Sunday          | Nope        |
    | anythingelse    | Nope        |