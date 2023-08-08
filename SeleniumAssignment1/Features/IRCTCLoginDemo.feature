Feature: lauching the IRCTC Website

  Scenario: checking the login homepage
    Given browser is open
    And user is on login page
    When user enter the username and password
    And click on signin button
    Then close the browser
