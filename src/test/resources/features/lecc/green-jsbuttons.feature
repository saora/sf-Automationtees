Feature: Get Green icon by scanning Js Buttons.
  In order validate Green icon for Js Buttons on Home Page of LECC
  As a Registered user
  I want to log in LECC and scan Js Button from Home page

  Description: Org with My Doman deployed and at least one Js Button added to any layout

  @expected-outcome:success
  Scenario: Configure the ORG to get green icon when scanning Js Buttons from Home Page tab
    Given I logs in salesforce page
    When I create a Js Button
    And I create a new custom Layout
    And I add the Js Button to a custom laytout
    Then I create MyDomain

  Scenario: Green scan result for Js button card
    Given I log in Lecc
    When I scan Js Button
    Then I should get the scanning results