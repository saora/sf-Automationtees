Feature: App Exchange Packages
  In order validate the scan results for App Exchange Packages from Home of LECC
  As a Registered user
  I want to log in LECC and scan App Exchange Packages

  Description: Org with MyDomain already deployed and at least one App Exchange Packages added to any layout

Background:
Given I navigate to Lecc Login page

  Scenario: Green icon by scanning App Exchange Packages
    When I log in org with green icon
    Then I should Logged In the salesforce page
    And I scan App Exchange Packages green icon
    And I should get green icon in the scanning results for App Exchange Packages

  Scenario: Yellow icon by scanning App Exchange Packages
    When I log in org with yellow icon
    Then I should Logged In the salesforce page
    And I scan App Exchange Packages yellow icon
    And I should get yellow icon in the scanning results for App Exchange Packages


