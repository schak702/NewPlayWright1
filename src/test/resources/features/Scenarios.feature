Feature: Login
  Background:
    Given user on the login page

  @regression @smoke
  Scenario Outline: Verification of Login Function
    Given user enters  "<email>" and password
    When user click "log in" button
   # Then user should see "My Account"

 Examples:
   | email         |
   | standard_user |

  Scenario Outline: utline : Unsuccessful login

    Given user enters  "<email>" and password
    When user click "log in" button
    Then error message displayed with "<Error message>"

 Examples:
   | email           | Error message                                       |
   | locked_out_user | Epic sadface: Sorry, this user has been locked out. |