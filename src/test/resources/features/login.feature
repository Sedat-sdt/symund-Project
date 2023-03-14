Feature: Symund app login feature

  User story:

  As a user I should be able to login.

  Background: User should be on login page for all scenarios.

    Given user is on the login page

  Scenario: User can login with valid username and password

    When user enters valid username and valid password
    Then user should see the dashboard

    Scenario: User can not login with invalid username or password

      When  user enters invalid username or invalid password
      Then user can not login and should see the "Wrong username or password." message.

    Scenario: User can not login with empty username or password
      When user enters empty username or empty password
      Then user can not login and should see "Please fill out this field" message.



