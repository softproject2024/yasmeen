Feature: Monitoring and Reporting
  Scenario: Monitoring profits
    Given : i am an "admin" and i want to see the profits
    When : i open the profits page the message "" must appear
    Then : the system must pass

    Scenario: Reporting profits
      Given : i am an "admin" and i want to see the profits
      When : i click at the button generate report
      Then : i choose the report name "report.txt"

    Scenario: Identify best-selling products
      Given : i am an "admin" and i want to see the best selling profit
      Then the best selling profit will be displayes as this "cucumber"



        Scenario: Content Management
        Given : i am an "admin" and i want to manage posts and  recipes
          When : i click at add post i must choose the path "p" of the image and description "des" and name "n"
          Then the number of posts must be incrased by one

