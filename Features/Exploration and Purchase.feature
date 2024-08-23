Feature:  Exploration and Purchase
  Scenario: browsing products and searching for them
    Given : i am an "User" and i want to search for the product "tomato"
    Then : the product must appear which is 1

    Scenario: Filter recipes
      Given : i am a "User" and i want to search with fillter with all products that does not have "allergic"
      Then : the number of products must appear which is 0

  Scenario:Purchase desserts directly from store owners
    Given : i am a "User" and i want to purchase the product "any"
    And : i want to Purchase 2 of this product
    Then : the quantity of that product must be increased by 2 and the number of sells must be increased by 1

  Scenario:Purchase desserts directly from store owners with value less than zero
    Given : i am a "User" and i want to purchase the product "any" but with invalid value
    And : i want to Purchase -1 of this product and this is less than zero
    Then : nothing will be changed

  Scenario:Purchase desserts directly from store owners with value bigger than the orginal quantity
    Given : i am a "User" and i want to purchase the product "any" but with value that is bigger than the orginal quantity
    And : i want to Purchase -1 of this product and this is bigger than the orginal quantity
    Then : nothing will be changed for it





