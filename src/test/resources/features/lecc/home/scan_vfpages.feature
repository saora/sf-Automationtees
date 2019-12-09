Feature: Visualforce Pages
  In order validate the scan results for Visualforce Pages from Home of LECC
  As a Registered user
  I want to log in LECC and scan Visualforce Pages

  Description: Org with MyDomain already deployed and at least one Actions and buttons added to any layout

 Background:
     Given I navigate to Lecc Login page

  Scenario: Green icon by scanning Visualforce Pages
       When I log in org with green icon
       Then I should Logged In the salesforce page
       And I scan Visualforce Pages green icon
       And I should get green icon in the scanning results for Visualforce Pages

  Scenario: Yellow icon by scanning Visualforce Pages
       When I log in org with yellow icon
       Then I should Logged In the salesforce page
       And I scan Visualforce Pages yellow icon
       And I should get yellow icon in the scanning results for Visualforce Pages