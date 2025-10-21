Feature: Checking DB
  Scenario Outline: I check what is in the DB
    Given a new user <user>
    When user calls the <endpoint> endpoint
    Then there are  more than <items> items
    Examples:
      | user  | endpoint      |  items  |
      | Random  | resolver    |   0  |
      | Random  | resolver    |   0  |
      | Random  | resolver    |   0  |