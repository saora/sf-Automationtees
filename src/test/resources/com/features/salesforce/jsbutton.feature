Feature: salesforce
  In order to test Home Page of application
  As a Registered user
  I want to validate the result of home page for Js Buttons

  Description: Log in salesforce page

  Background: User Logged in
  #Scenario: Log in salesforce
    Given I navigate to the Login page
    When I submit the username and password
    Then I should Logged In

  Scenario: Add Js Button
        Given I click on new Js Button
        When I submit Js Button Informtion
        Then I should create a new Js Button
