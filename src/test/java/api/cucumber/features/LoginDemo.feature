Feature: Test login Functionality
  Scenario Outline: Check login is successful with valid credentials
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples:
      | username | password |
    |Swathi     | 12345   |
    |sanjay     |12345    |
