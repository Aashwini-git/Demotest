Feature: login feature
We need validate the login feature of test cases

@smoke
  Scenario: Validate the login functionality with valid username and password
    Given User should be login page
    When  user enters valid username "Testing@gmail.com"
    And   user enters valid password "P2442"
    And   Clicks on submit
   