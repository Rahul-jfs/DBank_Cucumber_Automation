Feature: Logout Functionality

  Scenario: Verify user can logout successfully
    Given user opens website
    When user enters username "email" and password "password"
    And clicks on signIn button
    Then verify user successfully signed in
    When user clicks on the profile picture
    Then verify profile related options are displayed
    When user clicks on the logout button
    Then verify signIn page is displayed