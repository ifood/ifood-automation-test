@add_new_student
Feature: Add new student
  As a logged user
  Daniela would like to add new students
  To increase her contacts and found the students by id

  Background:
    Given "Daniela" is logged in the application

  @positive @android @ios
  Scenario Outline: Add new student
    And she fills the fields with the following values
      |code|<code>|
      |student name|<student_name>|
    When she triggers the save option
    Then a successful message should be displayed
    And the student added should be displayed in the list
    And the list should contain the old students
    And the list size should be increased by one item
    Examples:
      |code |student_name|
      |  1  | Daniela    |
      |  2  | Fernando   |
      |  3  | Dourado    |
      |  4  | Samuel     |

  @positive @android @ios
  Scenario Outline: Cancel the add action after fill the field(s)
    And she fills the fields with the following values
      |code|<code>|
      |student name|<student_name>|
    When she triggers the cancel option
    Then the both fields should be cleared
    Examples:
      |code   |student_name |
      |  059  |             |
      |       |0ADouradoZ9  |
      |   059 |0ADouradoZ9  |

  @negative @android @ios @bug-ios-0
  Scenario Outline: Try to add a new student with some empty fields
    And she fills the fields with the following values
      |code|<code>|
      |student name|<student_name>|
    When she triggers the save option
    Then the error message about the required field should be displayed
    And the new student is not added to the list
    And the completed field should remain with the written value
    Examples:
      |code     |student_name|
      |         |    test    |
      | 12344   |            |

  @negative @android @ios @bug-android @test
  Scenario: Try to add a student already present in the list
    And she fills the fields with an added student
    When she triggers the save option
    Then the error message about student already added should be displayed
    And the new student is not added to the list
    And the completed field should remain with the written value

  @negative @android @ios
  Scenario: Try to add the same student twice
    And she adds a student with the following value
      |code        |a059z    |
      |student name|Dourado  |
    When she tries to add the same student added using the same credentials
    Then the error message about student already added should be displayed
    And the completed field should remain with the written value



