Feature: Page login
  As a user I need to enter the Serenity Application Template

  Scenario Outline: Enter the application
    Given i am entry in the application
    When i enter the username <username> and the password <password>
    Then user enter the application


    Examples:

      |username      | password       |
      |admin         | serenity       |










