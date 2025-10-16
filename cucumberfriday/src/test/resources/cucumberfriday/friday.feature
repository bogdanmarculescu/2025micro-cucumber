Feature: Friday
  Everybody wants to know if it's Friday already

  Scenario Outline: Today is (or is not) Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

  Examples:
    | day             | answer      |
    | Friday          | TGIF        |
    | Monday          | Not Yet     |
    | Sunday          | Not Yet     |
    | anything else!  | Not Yet     |