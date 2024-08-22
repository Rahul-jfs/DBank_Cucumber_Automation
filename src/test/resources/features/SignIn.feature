Feature: SignIn functionality

  Scenario: verify user can login with valid credentials

    Given user opens website
    When user enters username "email" and password "password"
    And clicks on signIn button
    Then verify user successfully signed in