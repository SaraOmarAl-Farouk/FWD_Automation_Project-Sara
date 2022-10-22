@smoke
Feature: F05_Search | users will be able to search for products with different parameters

  Background: navigation to Demo NopCommerce website Home Page
    Given user navigate to homepage
  #First Scenario:
  Scenario: user could search using product name
    When  user click on search bar
    And   user search for product like "Apple"
    And   user click on search Button
    Then  user could search successfully and go to search page
    #Second Scenario:
  Scenario: user search using SKU
    When    user click on search bar
    And     user search for product like "AP_MBP_13"
    And     user click on search Button
    Then    user could search successfully with SKU
    #Third Scenario:
  Scenario: user search using invalid product name
    When    user click on search bar
    And     user search for product like "nothing"
    And     user click on search Button
    Then    user could not search