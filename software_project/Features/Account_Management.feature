Feature: Account Management
Scenario: updating Onwer name
  Given :i am an "Owner" and i want to update my old name which is "Yasmeen"
  Then : i want to change my name to "Yasmeen_Odeh"
  And : my name must be changed from "Yasmeen" to "Yasmeen_Odeh"

Scenario: updating Onwer age
  Given :i am an "Owner" and i want to update my age which is 20
  Then : i want to change my age to 21
  And : my age must be changed from 20 to 21

Scenario: updating Owner phone number
  Given :i am an "Owner" and i want to update my old phone number which is 0568669322
  Then : i want to change my phone number to 0598669322
  And : my phone number must be changed from 0568669322 to 0598669322


  Scenario: updating Supplier name
    Given :i am an "Supplier" and i want to update the Supplier name which is "Yaqoot"
    Then : i want to change the Supplier name to "Yaqoot_Odeh"
    And : the Supplier name must be changed from "Yaqoot" to "Yaqoot_Odeh"

  Scenario: updating Supplier age
    Given :i am an "Supplier" and i want to update the Supplier age which is 20
    Then : i want to change the Supplier age to 21
    And : the Supplier age must be changed from 20 to 21

  Scenario: updating Supplier phone number
    Given :i am an "Owner" and i want to update the Supplier old phone number which is 0568669311
    Then : i want to change the Supplier phone number to 0598669311
    And : the Supplier phone number must be changed from 0568669311 to 0598669311
