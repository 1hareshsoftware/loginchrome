@Login


Feature: I want to test Login Feature in gmail

  Background: I am on Login Page

  Scenario Outline: Login Feature

    When I enter Username as "<username>"
    And I click on Next button
    And I enter Password "<password>"
    And I click on Next Button
    Then i am not able to login successfully with Message "<errorrmessage>"

    Examples:
      |username         |password        |errorrmessage           |
      |hdahir2          |    rwer            |Please enter the password for your Microsoft account.|
      #|hdahir2          |admin123        |The account or password is incorrect. Please try again.|
      #|test987          |admin           |The account or password is incorrect. Please try again.     |


