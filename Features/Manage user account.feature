Feature: managing user account
  Scenario: Updating user information
    Given I am a "User" and I want to update my info
    And my old name is "Hitler"
    And my new name is "Yahay" and new age is 24 and new phone number is 12 and new password is 12
    Then the information must be updated


