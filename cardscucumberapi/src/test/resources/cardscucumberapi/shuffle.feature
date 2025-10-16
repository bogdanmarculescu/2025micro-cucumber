Feature: Getting cards
  Scenario: I call the Deck endpoint and get back shuffled cards
    Given a new user Bogdan
    When user calls the deck endpoint
    Then they get a 7 of shuffled cards