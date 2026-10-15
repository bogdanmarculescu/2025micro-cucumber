Feature: Deck and shuffling
  Scenario Outline:
    Given I am <user>
    When I call for <number> cards from <method>
    Then I receive <correctnumber> of cards
    Examples:
      | user        | number | method      | correctnumber |
      | Bogdan      | 7      | false  | 7 |
      | Bernadotte  | 6      | counted     | 6 |
      | Davout      | 5      | counted     | 5 |
      | Random      | 3      | counted     | 3 |