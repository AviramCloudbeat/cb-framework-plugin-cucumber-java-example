@somefeature
Feature: Is it Wednesday yet?
  Everybody wants to know when it's Wednesday


  @Wednesday
  Scenario: Today is or is not Wednesday
    Given today is "Wednesday"
    When I ask whether it's Wednesday yet
    Then I should be told "TGIF"
