Feature: Is it friday
  Scenario Outline: Is it friday
    Given I know that  today is <day>
    When I ask  if it's <someday>
    Then I get an <answer>

    Examples:
      |  day          | someday | answer   |
      | Friday        | Friday | Yeey     |
      | Monday        | Friday | Nope     |
      | Thursday      | Thursday| Yep     |