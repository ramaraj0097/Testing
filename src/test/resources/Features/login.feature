Background:

Feature: validation of the login page

  Scenario: Verify login account
    Given User open the JC Penny website
    When User click the signin button
    When User enter the email address
    And User enter the password
    When User click the signin button
    Then User verify the account
    

  
