@UniformAppTest
Feature: Uniform Application Test
 
  Scenario: Uniform Application Registration
    Given I Navigate to Unform Application by entering valid URL
    When I click on My Account Icon
    And I click on Register link
    Then I validate that Registration page is displayed
    Then I fill in the data in required fields
    And Click on Continue button
    Then I validate that Account is created successfully
   Then I close the browser
    
Scenario: Uniform Application Login
    Given I Navigate to Unform Application by entering valid URL
    When I click on My Account Icon
    And I click on Login link
    Then I enter valid login credentials
    And I click on Login button
   Then I validate that My Account page is displayed
  Then I close the browser
    
Scenario: Uniform Application Login
   Given I Navigate to Unform Application by entering valid URL
    When I click on My Account Icon
    And I click on Login link
    Then I enter login credentials
    And I click on Login button
    Then I validate that Warning message for No Match is displayed
    Then I click on Forgot Password link
    Then I validate that password retrieval page is displayed
    Then I enter registered email in email address text box
    And click on Continue button on forgot password page
    Then I validate that appropriate message is displayed 
    Then I close the browser
 #Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
 #   When I check for the <value> in step
 #   Then I verify the <status> in step

 #   Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |