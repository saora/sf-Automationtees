Feature: Org config
  In order to validate the org functionalities
  As a Registered user
  I want to add data configuration

  Description:

  @expected-outcome:success
  Scenario: Create and deploy MyDomain
    Given I navigate to Lecc Login page
    When I log in org
    Then I go to MyDomain
    And I register a new domain
    And I deploy MyDomain