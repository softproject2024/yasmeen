Feature: Communication and Feedback
  Scenario: Feedback a product or post
    Given I am a "User" and I want to provide feedback on a product or post
    Then I can choose an owner "Yasmeen" or supplier "Yahya"
    And I write the message of the feedback "The product is very good"
    Then the number of messages to each one must be increased by 1



