Feature: Login functionality with valid credentials
  User Story :
  As a user, I should be able to log in.


  Scenario: Login as a driver
    When the user is on the login page
    When the user logs in as a driver
    Then the user is on the Quick Launchpad

  Scenario: Login as sales manager
    When the user logs in as a sales manager
    Then the user is on the Dashboard page

  Scenario: Login as a store manager
    When the user logs in as a store manager
    Then the user is on the Dashboard page


