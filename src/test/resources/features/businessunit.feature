Feature: Business Unit
As a user I need create a business unit

Scenario Outline: Create Business Unit correctly
Given i am create business unit in the application
And i enter the login information username <username> and the password <password>
When i enter the name business <namebusiness>
Then user view record in the application

Examples:
|username       | password       |  namebusiness            |
|admin          |   serenity     |  prueba automatica       |
