@GoogleTest
Feature: Google Search.
 
 Scenario: Google
        Given Navigate to Google Search Application
        When I enter search keyword 
        Then Click on First Search Result
        And Close browser
