Feature: Get Yellow icon by scanning Js Buttons

  In order validate orange icon for Js Buttons on Home Page from LECC
  As a Registered user
  I want to log in LECC and scan Js Button

  Description: Org with at least one Js Button added to any layout

  #@expected-outcome:success
  Scenario: Configure the ORG
    Given I logs in salesforce page
    When I create a Js Button
    And I create a new custom Layout
    Then I add the Js Button to a custom laytout

#  @expected-outcome:success
#  Scenario: Scann Js button
#    Given I log in Lecc
#    When I scan Js Button
#    Then I should get the scanning results
