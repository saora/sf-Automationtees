Feature: Log in Salesforce page
In order to configure or scan the custom object of my org
As a registered user
I want to be able to log in Salesforce page

Description: Log in Salesforce page

Background:
  Scenario: Log in Lecc page
    Given I navigate to Lecc Login page
    When I submit the username and password
    Then I should Logged In the salesforce page

