Feature: Tests for Rules

  Background:
    * url localBaseUrl
    * def order =
      """
      {
        "orderId": "123",
        "paymentType": "CARD",
        "totalPrice": "7000"
       }
      """

  Scenario: get all rules
    Given path 'rules'
    When method get
    Then status 200
    And match response contains "Rules!"

  Scenario: create a user from given details.

    Given path '/discount'
    And request order
    When method post
    Then status 200
    And match response.discount == 5