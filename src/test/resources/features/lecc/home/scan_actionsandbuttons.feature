Feature: Visualforce pages
  In order validate the scan results for visualforce Pages from Home of LECC
  As a Registered user
  I want to log in LECC and scan Visualforce pages

  Description: Org with MyDomain already deployed and at least one Js Button added to any layout

  @expected-outcome:success
  Scenario: Green icon by scanning Visualforce pages
    Given I navigate to Lecc Login page
    When I log in org with green icon
    Then I should Logged In the salesforce page
    And I scan visualforce pages green icon
    And I should get green icon in the scanning results

  Scenario: Yellow icon by scanning Js Buttons
    Given I navigate to Lecc Login page
    When I log in org with yellow icon
    Then I should Logged In the salesforce page
    And I scan visualforce pages yellow icon
    And I should get yellow icon in the scanning results