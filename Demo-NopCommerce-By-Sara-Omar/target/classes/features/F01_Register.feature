@smoke

Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
  Given user go to register page
  When user select gender type
  And  user enter first name "Sara" and last name "Omar"
  And  user enter date of birth
  And  user enter email "Test12345@test.com" field
  And  user enter company name
  And  user fills Password fields "P@ssw0rd" and "P@ssw0rd"
  And  user clicks on register button
  Then success message is displayed