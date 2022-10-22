Feature: F07_Sliders | users will be able to open sliders in home page

  Background: navigation to Demo NopCommerce website Home Page
    Given user navigate to homepage


  Scenario: First slider clickable on homepage
    When    user clicks on first slider
    Then    relative product for first slider is displayed


  Scenario: Second slider clickable on homepage
    When    user clicks on second slider
    Then    relative product for second slider is displayed