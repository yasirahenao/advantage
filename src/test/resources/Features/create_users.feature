Feature: successfully create users
  me as course automation
  i need create users
  to validate that users are successfully created

  Scenario: create an user successfully
    Given I want to go to the page of Advantage demo
    When I enter the information to create the user
    Then I validate the correct user creation