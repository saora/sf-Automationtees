Feature: Hard-Coded URLs
  In order validate the scan results for Hard-Coded URLs from Home of LECC
  As a Registered user
  I want to log in LECC and scan Hard-Coded URLs

  Description: Org with MyDomain already deployed and at least one Hard-Coded URLs added to any layout

 Background:
     Given I navigate to Lecc Login page

  Scenario: Green icon by scanning Hard-Coded URLs
       When I log in org with green icon
       Then I should Logged In the salesforce page
       And I scan Hard-Coded URLs green icon
       And I should get green icon in the scanning results for Hard-Coded URLs

  Scenario: Orange icon by scanning Hard-Coded URLs
       When I log in org with yellow icon
       Then I should Logged In the salesforce page
       And I scan Hard-Coded URLs Orange icon
       And I should get Orange icon in the scanning results for Hard-Coded URLs

