@LoginProfile
Feature: LoginProfile2

## @author Bala

  Scenario Outline: Validation of the Login 
   Given I am on the Page "<URL>" with "<Username>" and "<Password>"
   
   Examples:
      | URL    																			 |  Username  						| Password  |
      | http://automationpractice.com/index.php?controller=authentication&back=my-account| balasubramaniant1993@outlook.com | Bal@20204 |
      | http://automationpractice.com/index.php?controller=authentication&back=my-account| balasubramaniant1993@outlook.com | Bal@20204 |
   