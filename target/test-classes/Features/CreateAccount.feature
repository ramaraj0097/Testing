

Feature: Validation of the create account page

  Scenario: Verify confirm your account text
    Given User login the JC Penny website
    Then  User verify the "JCPenney: Clothing, Bed & Bath, Home Decor, Jewelry & Beauty" is displayed on the title
    When  User mouseover the My account button
    And   User click the create account
    Then  User verify the Create Account text
    When  User enters the "Ramaraj", "Ram", "(222) 595-4549", "ramaraj0097@gmail.com", "March@2023"
    And   User click the Create account button
    Then  Verify the Confirm Your Account text
    

  