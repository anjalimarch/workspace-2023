Feature: Login page feature
  

  Scenario: Login Page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "MyTEC - Login"

 
  Scenario: Forgot Password Link
    Given user is on login page
    Then forgot yout password link should be displayed


   Scenario: Login with correct credentials
     Given user is on login page
     When user enters username "anjalimarch24@gmail.com"
     And user enters password "krishna.123"
     And user clicks on login button 
     Then user gets the title of the home page
     And page title should be "MyTEC - Login"