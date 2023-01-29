
Feature: Account Page Feature


  Background:
    Given user has already logged in to application
    |username|paswword|
    |anjalimarch24@gmail.com|krishna.123|

  
  Scenario: Accounts Page Title
    Given user is on Accounts page
    When user gets the title of the Page
    Then page title should be "My Account"

    
  Scenario: Accounts section count
    Given user is on Accounts page
    When user gets accounts section
    |My Account|
    |My Orders|
    |My Affiliate Account|
    |Newsletter|
    And accounts section count should be 4
