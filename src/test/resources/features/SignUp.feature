Feature: SignUp Functionality

  Scenario: verify user can signup
    Given user opens website
    When user clicks on signUp link
    Then verify user signUp page is displayed
    When user enters signUp details
    And clicks on next button
    Then verify next signUp page is displayed
    When user enters other details
    And selects terms and policy
    And user clicks on register button
    Then verify user is registered successfully
