@login
Feature: Login
  As a user
  Daniela would like to access her account
  To have accesses her student list

  Background:
    Given "Daniela" is in the login screen

  @positive @android @ios
  Scenario: login successful
    And she fills the login fields with valid values
    When she triggers the log in option
    Then the include new student section should be displayed

  @negative @android @ios
  Scenario Outline: Try login with invalid values
    And she fills the login fields with the following values
      |user|<user>|
      |password|<pass>|
    When she triggers the log in option
    Then the error message related the login error should be displayed
    Examples:
      |user|pass|
      # registered user but empty pass
      |  teste@teste.com  |    |
      # registered pass but empty user
      |    |  123456  |
      # valid email but not registered
      |   test@ts.com |    |
      # invalid email
      |   teste@.com |  123456  |
      # valid email and invalid password
      |   teste@teste.com |  12345  |
      # invalid user and valid password
      |   teste@te.com |  123456  |


