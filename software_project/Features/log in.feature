Feature: sign in
  Scenario: i am a uesr and i want to log in as amdin
    Given : i am an "Admin" and i want to sign in to the system as admin
    Then : i must enter my email "ad1@g.c" and my password 12121212 as admin
    Then : the system must pass me as admin


  Scenario: i am a uesr and i want to log in as owner
    Given : i am an "Owner" and i want to sign in to the system as owner
    Then : i must enter my email "ow1@g.c" and my password 12121212 as owner
    Then : the system must pass me as Owner

  Scenario: i am a uesr and i want to log in as supplier
    Given : i am an "Supplier" and i want to sign in to the system as supplier
    Then : i must enter my email "su1@g.c" and my password 12121212 as supplier
    Then : the system must pass me as supplier
  Scenario: i am a uesr and i want to log in as user
    Given : i am an "User" and i want to sign in to the system as user
    Then : i must enter my email "us1@g.c" and my password 12121212 as user
    Then : the system must pass me as user



