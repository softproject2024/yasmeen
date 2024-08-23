Feature: Sign up
  Scenario: i am a new user and i want to log up to the system as admin
    Given : i am a new user with type "Admin" to be a new admin
    And : my name is "khalid" and my age is 2 and my phone number is 1231231231 and password is 12121212 and email "ad12@g.c" as admin
    Then the Admin users must be increased by 1


  Scenario: i am a new user and i want to log up to the system as owner
    Given : i am a new user with type "Owner" to be a new owner
    And : my name is "khalid" and my age is 2 and my phone number is 1231231231 and password is 12121212 and email "ow21@g.c" as owner
    Then the Owner users must be increased by 1


  Scenario: i am a new user and i want to log up to the system as supplier
    Given : i am a new user with type "Supplier" to be a new supplier
    And : my name is "khalid" and my age is 2 and my phone number is 1231231231 and password is 12121212 and email "su12@g.c" as supplier
    Then the Suppliers users must be increased by 1


  Scenario: i am a new user and i want to log up to the system as user
    Given : i am a new user with type "User" to be a new user
    And : my name is "khalid" and my age is 2 and my phone number is 1231231231 and password is 12121212 and email "us21@g.c" as user
    Then the User users must be increased by 1


