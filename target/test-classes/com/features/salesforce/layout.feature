@SALEFORCE
Feature: Definition

  Story: Look for definition

  In order to test the layouts for Objects
  As a Registered user
  I want to validate the layouts

  Description: Layouts for objects

  Background: User Logged in
  #Scenario: Log in com
    Given I navigate to the Login page
    When I submit the username and password
    Then I log in Salesforce page
    Then I select the Object

  Scenario:Add layout
    Given I select the layout option
    When I create a Layout
    Then I should create a new Layout

