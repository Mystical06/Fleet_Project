Feature: Login functionality with valid credentials
  User Story :
  As a user, I should be able to log in.
  Background: For the scenarios in the feature file, user is expected to be on login page
    Given the user is on the login page

  Scenario: Login as a driver
    When the user logs in as a driver
    Then the user is on the Quick Launchpad

  Scenario: Login as sales manager
    When the user logs in as a sales manager
    Then the user is on the Dashboard page

  Scenario: Login as a store manager
    When the user logs in as a store manager
    Then the user is on the Dashboard page


    Scenario: The user sees their own "username" in the profile menu after login
      When the user logs in as a driver
      Then the user sees their own username in the profile menu

    Scenario: The sales manager sees their own "username" in the profile menu after login
      When the user logs in as a sales manager
      Then the sales manager sees their own username in the profile menu

    Scenario: The store manager sees their own "username" in the profile menu after login
      When the user logs in as a store manager
      Then the store manager sees their own username in the profile menu



