Feature: Tests for Rules

  Background:
    * url demoBaseUrl

  Scenario: get all rules
    Given path 'rules'
    When method get
    Then status 200
    And match response contains "Rules!"
