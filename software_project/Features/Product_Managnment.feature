Feature: Product Management
  Scenario: Adding new "tomato" to my store
    Given : i am an "Owner" and i want to add some new products
    Then : The product "tomato" will be added to the store

  Scenario: Adding new quantity of the product "tomato" to an exist quantity of the product
    Given : i am an "Owner" and i want to add a new quentity of the product "tomato"
    Then : The quantity of the product "tomato" will increase

  Scenario: Updating the expiry Date of the exist product "tomato"
      Given : i am an "Owner" and i want to update the expiry Date of the exist product "tomato"
      Then : the expiry Date of the product "tomato" will be changed
  Scenario: Updating the expiry Date of the not exist product "tomato"
    Given :i am an "Owner" and i want to update the expiry Date of the product "Orange"
    And : the system did not find the product "Orange"
    Then :A message will apear tells that the product "Orange" is not exist


  Scenario: Removing an exist product
    Given : i am an "Owner" and i want to remove the exist product "tomato"
    Then : the number of the products in the store will be decreased by 1

   Scenario: Removing an product that is not exist
     Given : i am an "Owner" and i want to remove a product
     And : the product "Orange" is not exist
     Then : there is nothing to remove and the number of products remain the same and a message will appear that tells nothing is removed

    

    





