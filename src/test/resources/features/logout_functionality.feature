
 @PER10-259
Feature: Logout functionality
  As a user, I should be able to log out
  Background: For the scenarios in the feature file, user is expected to be on login page
    Given the user is on the login page
  @PER10-257
    Scenario: The user can log out using the log-out button inside the profile info and end up on the login page
      When the user logs in as a driver
      Then the user logs out using the logout button inside the profile info
      Then the user ends up on the login page
  @PER10-258
    Scenario: The user can not go to the home page again by clicking the step back button after successfully logging out
      When the user logs in as a driver
      Then the user logs out using the logout button inside the profile info
      When the user clicks step back button
      Then the user is still on the login page
