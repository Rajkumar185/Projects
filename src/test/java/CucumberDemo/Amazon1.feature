
Feature: Launching the Amazon Website
 
 Background: 
    Given I landed on Amazon Website
 
    
  Scenario Outline: Signin into the Amazon With Invalid Credentials
    Given user is Signin with emailorphonenumber <number>
    When click on Continue button
    Then enter the password  <password>
    When click on signin button
    Then Error message is displayed 
  
    
    Examples: 
      | number     | password |
      | 9182014723 | Raj      |