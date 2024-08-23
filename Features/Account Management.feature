Feature: Account Management

  Scenario: Updating Owner's Name
    Given I am an "Owner" and I want to update my old name, which is "Yasmeen"
    When I change my name to "Yasmeen_Odeh"
  Then : my old name should be "Yasmeen" and the new name should be "Yasmeen_Odeh"

  Scenario: Updating Owner's Age
    Given I am an "Owner" and I want to update my age, which is 20
    When I change my age to 21
    And my old age should be 20 and the new age should be 21


  Scenario: Updating Supplier's Name
    Given I am a "Supplier" and I want to update the Supplier's name, which is "Yaqoot"
    When I change the Supplier's name to "Yaqoot_Odeh"
    Then the Supplier's name should be updated to "Yaqoot_Odeh"


  Scenario: Updating Supplier's Age
    Given I am a "Supplier" and I want to update the Supplier's age, which is 20
    When I change the Supplier's age to 21
    Then the Supplier's age should be updated to 21





