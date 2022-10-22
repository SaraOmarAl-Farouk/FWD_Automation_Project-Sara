@smoke
Feature:F04_Currency | user could switch between currencies US-Euro

  Scenario: Logged User could switch between currencies
    Given user navigate to homepage
#First step of Test
    When user change current currency to Euro
    Then user should found all products prices in Euro
#Second step of Test
    When user change current currency to Dollar
    Then user should found all products prices in Dollar