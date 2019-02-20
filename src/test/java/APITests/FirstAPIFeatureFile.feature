Feature: TestRestAPI
  This is a feature file to test Rest API calls.

  @FirstRestAPITests
  Scenario: First API test - 200 response and return value check
    Given as an authenticated "Validuser" API user
    And I have an endpoint "Myfirstendpoint"
