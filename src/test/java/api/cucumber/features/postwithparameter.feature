Feature:post feature of facebook
  This will test the post functionality at the user wall
Background: This is for common steps
  Given User should be logged in and should be present on his wall
  Scenario: post a message on user wall
    When I type the message as "My post" in the text box
    And Click on the Post button
    Then the message should get posted

  Scenario: post a video on user wall
    When User supply the youtube link as "https://www.google.com" in the text box
    And Click on the Post button
    Then The video should get posted on the user wall
    And the video should have proper thumbnail

