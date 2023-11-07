@tag
Feature: Launching the IRCTC Website
  

Background: 
     Given Launch IRCTC Website
 
  @tag2
  Scenario Outline: User with invalid credentials should not be able to Login IRCTC
    Given check alerts and click on menubar
    And click on Login Button
    When Enter valid name <name> and invalid password<password>
    Then click on the siginButton
    Then Error msg should be displayed
    Then Take error screenshot 
    And close the browser
    
  
    Examples: 
      | name     | password       |
      | Rajkumar | Rajkumar185    |
    
