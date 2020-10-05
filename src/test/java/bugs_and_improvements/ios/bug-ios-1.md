#Bug code: bug-ios-1
#Severity: High
###Summary
[iOS] The role applied on student id is a case-sensitive

###Step to Reproduce
Given the user is logged int the application
And she adds a student with the following value in lowercase
```
 |code        |abc      |
 |student name|Dourado  |
```
When she tries to add the same student added using the same credentials in uppercase 

###Expected Behavior
Then the error message about student already added should be displayed 

###Current Behavior
Then the new user is added

###Additional Information
iOS
Tested using emulator
