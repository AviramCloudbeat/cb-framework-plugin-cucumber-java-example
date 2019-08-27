Feature: Is it Wednesday yet?
  Everybody wants to know when it's Wednesday

  @Wednesday
  Scenario: Today is probably Wednesday
    Given today is "Wednesday"
    When I ask whether it's Friday yet
    Then I should be told "TGIF"
