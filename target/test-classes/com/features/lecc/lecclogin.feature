Feature: Lecc Home Page

  Description: Log in LECC page

  Background:

  Scenario: Log in LECC
    Given I navigate to the LECC Login page
    When I submit the username and password for Lecc
    Then I should Logged In LECC