@logout
Feature: Logout
  As a logged user
  Daniela would like exit of the application
  To protect her account

  Background:
    Given "Daniela" is logged in the application

  @positive @android @ios
  Scenario: Logout
    When he clicks on the logout option
    Then the login screen should be displayed



