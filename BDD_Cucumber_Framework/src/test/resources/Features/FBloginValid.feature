@tag
Feature: Login FB Application

  @tag1
  Scenario: Login to the Facebook application with valid credentials
    Given Open FB URL
    When User enter valid credentials
    And Click on login button
    Then Application should displays the validation message

  @tag2
  Scenario: Logout to the Facebook application
    Given Open FB URL
    When User enter valid credentials
    And Click on login button
    Then Logout functionality
