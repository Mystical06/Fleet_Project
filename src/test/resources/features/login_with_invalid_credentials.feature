
@wip
Feature: Login functionality with invalid credentials or empty fields.
  User Story :
  As a user, I shouldn't be able to log in.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given the user is on the login page

    Scenario: User can not login with invalid credentials
      When the user enters invalid username and password
      Then the user sees 'Invalid username or password'

    Scenario: User sees warning message
      When the user leaves the username or password field empty
      Then the user sees 'Please fill out this field' warning message

    Scenario:User sees a warning message
      When the user leaves both username and password fields empty and clicks on login button
      Then the user sees 'Please fill out this field' warning message only in the username field


