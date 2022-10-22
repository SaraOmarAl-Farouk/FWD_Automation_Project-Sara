@smoke

Feature:F03_PasswordRecovery | User could reset password successfully

  Scenario: User could reset the password successfully
    Given user navigate to login page
    And   user click on forgot password
    Then  user fill email with valid email
    And   user click on Recover button
    Then  user should see message