Feature: Get Yellow icon by scanning Js Buttons.
  In order validate orange icon for Js Buttons on Home Page from LECC
  As a Registered user
  I want to log in LECC and scan Js Button

  Description: Org without MyDomain already deployed and at least one Js Button added to any layout

  @expected-outcome:success
  Scenario: Log in Lecc page
    Given I navigate to Lecc Login page
    When I log in org with yellow icon
    Then I should Logged In the salesforce page
    And I scan Js Button yellow icon
    Then I should get yellow icon in the scanning results
