Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

Examples:
    | day            | answer |
    | Friday         | Yes  |
    | Sunday         | No   |
    | Saturday       | No   |
    | Monday         | No   |
    | Tuesday        | No   |
    | Wednesday      | No   |
    | Thursday       | No   |

