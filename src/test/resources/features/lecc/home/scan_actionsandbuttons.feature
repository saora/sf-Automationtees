Feature: Actions and Buttons
  In order validate the scan results for Actions and Buttons from Home of LECC
  As a Registered user
  I want to log in LECC and scan Actions and Buttons

  Description: Org with MyDomain already deployed and at least one Actions and buttons added to any layout

 Background:
 Given I navigate to Lecc Login page

  Scenario: Green icon by scanning Actions and Buttons
    When I log in org with green icon
    Then I should Logged In the salesforce page
    And I scan Actions and Buttons green icon
    And I should get green icon in the scanning results for Actions and Buttons

      Scenario: Yellow icon by scanning Actions and buttons
        When I log in org with yellow icon
        Then I should Logged In the salesforce page
        And I scan Actions and Buttons yellow icon
        And I should get yellow icon in the scanning results for Actions and Buttons
