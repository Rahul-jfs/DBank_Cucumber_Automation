Feature: Checking account creation functionality

  Scenario: verify user can create a checking account
    Given user opens website
    When user enters username "email" and password "password"
    And clicks on signIn button
    Then verify user successfully signed in
    When user clicks on checking menu
    And selects new checking option
    Then verify create checking page is displayed
    When user enters checking account type "checkingAccount.type" and account ownership "checkingAccount.ownership"
    And enters account name "checkingAccount.name" and initial deposit "checkingInitial.deposit"
    And clicks on checking submit button
    Then verify checking account is created of account name "checkingAccount.name" and initial deposit "checkingInitial.deposit"
