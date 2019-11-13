Feature: Home Page
  In order to test Home Page of application
  As a Registered user
  I want to validate the result of home page for Js Buttons

  Description: Log in LECC Home Page

  Background: Log in Lecc Home Page
      Given I navigate to the Login Lecc page
      When I submit the username and password for lecc
      Then I should Logged In Lecc home page

  Scenario: Scan Js Button from Home Page
    Given Click on Scan Js Button from Home Page
    When Confirm the Js Button Scann
    Then I should get the results




