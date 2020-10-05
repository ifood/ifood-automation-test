#Bug code: bug-ios-0
#Severity: Medium
###Summary
[iOS] The error message was not displayed when the user tries to add a student already added in the default list

###Step to Reproduce
Given the user is logged int the application
When she tries to add the same user displayed in the default list

###Expected Behavior
Then the error message about student already added should be displayed

###Current Behavior
Then the error message is not displayed

###Additional Information
Android
Tested using only the emulator