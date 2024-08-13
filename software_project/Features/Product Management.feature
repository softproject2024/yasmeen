Feature: Product Management

  Scenario: Adding a new product "tomato" to the store
    Given I am an "Owner" and I want to add new products
    When I add "tomato" to the store
    Then the product "tomato" should be added to the store

  Scenario: Adding new quantity to an existing product "tomato"
    Given I am an "Owner" and I want to add a new quantity to the product "tomato"
    When I add a new quantity with value 17
    Then the quantity of the product "tomato" should increase by 17

  Scenario: Updating the expiry date of an existing product "tomato"
    Given I am an "Owner" and I want to update the expiry date of the existing product "tomato"
    When I update the expiry date of to "1/8/2027
    Then the expiry date of the product should be changed

  Scenario: Updating the expiry date of a non-existing product "Orange"
    Given I am an "Owner" and I want to update the expiry date of the product "Orange"
    When the system does not find the product "Orange"
    Then a message should appear indicating that the product "Orange" does not exist

  Scenario: Removing an existing product "tomato"
    Given I am an "Owner" and I want to remove the existing product
    When I remove "tomato" from the store
    Then the number of products in the store should decrease by 1

  Scenario: Removing a non-existing product "Orange"
    Given I am an "Owner" and I want to remove a product
    When the product "Orange" does not exist
    Then a message should appear indicating that there is nothing to remove and the number of products remains the same

  Scenario: Updating the price of an existing product "tomato"
    Given I am an "Owner" and I want to update the price of the existing product
    When I update the price of "tomato" to 15
    Then the price of the product "tomato" should be changed

  Scenario: Implementing a discount on an existing product "tomato"
    Given I am an "Owner" and I want to implement a discount on the product
    When I apply a discount of 20 % on "tomato"
    Then the discount on the product "tomato" should be updated to 20 %

  Scenario: Adding a product with an invalid expiry date
    Given I am an "Owner" and I want to add a new product with an invalid expiry date
    When I attempt to add "banana" with the expiry date "invalid-date"
    Then a message should appear indicating that the expiry date format is incorrect

  Scenario: Adding a product with an invalid price
    Given I am an "Owner" and I want to add a new product  with an invalid price
    When I attempt to add "apple" with a price of -10
    Then a message should appear indicating that the price is invalid

  Scenario: Adding a product with an invalid quantity
    Given I am an "Owner" and I want to add a new product with an invalid quantity
    When I attempt to add "grape" with a quantity of -5
    Then a message should appear indicating that the quantity is invalid

  Scenario: Adding a duplicate product with the same name but different attributes
    Given I am an "Owner" and I want to add a duplicate product
    When I attempt to add "tomato" with a different price and quantity
    Then a message should appear indicating that the product already exists

