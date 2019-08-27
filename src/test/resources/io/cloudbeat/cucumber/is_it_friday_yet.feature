@somefeature
Feature: Is it Friday yet?
  Everybody wants to know when it's Friday


  @friday
  Scenario: Today is or is not Friday
    Given today is "Friday"
    When I ask whether it's Friday yet
    Then I should be told "TGIF"

  @tuesday
  Scenario: Today is or is not Friday
    Given today is "Friday"
    When I ask whether it's Friday yet
    Then I should be told "TGIF"