@tag
Feature: Login FB Application

  @tag1
  Scenario: Login to the Facebook application with invalid credentials
    Given Open FB URL
    When User enter invalid credentials
    And Click on login button
    Then Application should displays the validation message
