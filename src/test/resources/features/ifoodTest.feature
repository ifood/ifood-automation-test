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