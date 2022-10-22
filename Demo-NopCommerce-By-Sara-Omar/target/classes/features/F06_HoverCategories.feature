@smoke
Feature: F06_HoverCategories  |  user could hover categories and select sub category


  Scenario: user could hover categories
    Given   user navigate to homepage
    When    user hover category and select subcategory
    And     user click on subcategory
    Then    user go to relative product page
