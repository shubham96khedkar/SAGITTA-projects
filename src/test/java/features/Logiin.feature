Feature: Check Login functionality

  Background: Login
    Given Navigate to URL

  Scenario: Login with correct credential
    When Enter username and password and click on login button
    Then User should land on homepage

  Scenario: Login with wrong credentials
    When Enter wrong username and password and click on login button
    Then User should land on homepage and verify URL
