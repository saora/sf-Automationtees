Feature: Js Buttons
  In order validate the scan results for Js Buttons from Home of LECC
  As a Registered user
  I want to log in LECC and scan Js Button

  Description: Org with MyDomain already deployed and at least one Js Button added to any layout


  Scenario: Green icon by scanning Js Buttons
    Given I navigate to Lecc Login page
    When I log in org with green icon
    Then I should Logged In the salesforce page
    And I scan Js Button green icon
    And I should get green icon in the scanning results

  Scenario: Yellow icon by scanning Js Buttons
    Given I navigate to Lecc Login page
    When I log in org with yellow icon
    Then I should Logged In the salesforce page
    And I scan Js Button yellow icon
    And I should get yellow icon in the scanning results