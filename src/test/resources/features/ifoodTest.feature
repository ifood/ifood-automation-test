Feature: Ifood test

  As a automator
  I want to build an automation for ifood test app
  So I can demonstrate my skills in automation for the test

  Scenario: validate when log in to the application with correct credentials displays creation of students
    Given the user is at the login screen
    When the user types the username
    And the user types password
    And the user clicks on the button Entrar
    Then the app displays the main screen for adding students

  Scenario: validate when user inserts new record in list displays value on the bottom
    Given the user is at the main screen for adding students
    And the user types a new id
    And the user types a new student
    When the user clicks on save button
    Then the app displays the record on the bottom of the list

  Scenario: validate when user clicks on save button with no filled info the app displays error message
    Given the user is at the main screen for adding students
    When the user clicks on save button before filling the information
    Then the app displays the alert message for filling the information