Feature: Launching the Amazon Website
  I want to use this template for my feature file

  Background: 
    Given I landed on Amazon Website

  @tag2
  Scenario Outline: Signin into the Amazon and changing the country name in dropdown
    Given Signin with emailorphonenumber <phoneno>  and click on continue
    And enter the password  <password> and click on signin button
    Then It redirecting to homepage
    When cursor move  dropdown
    Then click on dropdown
    And change the country name in dropdown
    Then It redirecting to home page

    Examples: 
      | phoneno    | password |
      | 9182014723 | Rajkumar |