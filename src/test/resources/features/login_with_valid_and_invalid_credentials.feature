
@PER10-256
Feature: Login functionality with valid or invalid credentials
  User Story :
  As a user, I should be able to log in.
  Background: For the scenarios in the feature file, user is expected to be on login page
    Given the user is on the login page
@PER10-247
  Scenario: Login as a driver
    When the user logs in as a driver
    Then the user is on the Quick Launchpad
@PER10-248
  Scenario: Login as sales manager
    When the user logs in as a sales manager
    Then the user is on the Dashboard page
  @PER10-249
  Scenario: Login as a store manager
    When the user logs in as a store manager
    Then the user is on the Dashboard page
  @PER10-250
  Scenario: User can not login with invalid credentials
    When the user enters invalid username and password
    Then the user sees 'Invalid username or password'
  @PER10-251
  Scenario: User sees warning message if username OR password field is empty
    When the user leaves the username or password field empty
    Then the user sees 'Please fill in this field' warning message
  @PER10-252
  Scenario:User sees a warning message if BOTH username AND password field are empty
    When the user leaves both username and password fields empty and clicks on login button
    Then the user sees 'Please fill in this field' warning message only in the username field

  @PER10-253
    Scenario: The driver sees their own "username" in the profile menu after login
      When the user logs in as a driver
      Then the driver sees their own username in the profile menu
  @PER10-254
    Scenario: The sales manager sees their own "username" in the profile menu after login
      When the user logs in as a sales manager
      Then the sales manager sees their own username in the profile menu
  @PER10-255
    Scenario: The store manager sees their own "username" in the profile menu after login
      When the user logs in as a store manager
      Then the store manager sees their own username in the profile menu



