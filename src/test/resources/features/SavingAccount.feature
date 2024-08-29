Feature: Saving account creation functionality

  Scenario: verify user can create a saving account
    Given user opens website
    When user enters username "email" and password "password"
    And clicks on signIn button
    Then verify user successfully signed in
    When user clicks on saving menu
    And selects new saving option
    Then verify create saving page is displayed
    When user enters saving account type "savingAccount.type" and account ownership "savingAccount.ownership"
    And enters account name "savingAccount.name" and initial deposit "savingInitial.deposit"
    And clicks on saving submit button
    Then verify saving account is created of account name "savingAccount.name" and initial deposit "savingInitial.deposit"
