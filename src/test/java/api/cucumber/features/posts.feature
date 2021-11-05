Feature: Post feature of facebook
  This will test the post functionality at the user wall

  Scenario: post a message on user wall
    Given User should be logged in and should be present on his wall
    When I type the message in the box
    And Click on the Post button
    Then the message should get posted