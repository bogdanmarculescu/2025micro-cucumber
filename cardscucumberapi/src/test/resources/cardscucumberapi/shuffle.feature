Feature: Getting cards
  Scenario Outline: I call the Deck endpoint and get back shuffled cards
    Given a new user <username>
    When user calls the <deck> endpoint
    Then they get a <number> of shuffled cards
    Examples:
      | username  | deck |      number |
      | Bogdan    | deck |           7 |
      | Random    | deck |           7 |
      | Lannes    | deck |           7 |
      | Davout    | deck |           7 |
      | Murat     | deck |           7 |