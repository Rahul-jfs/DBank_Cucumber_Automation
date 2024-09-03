Feature: Change Password Functionality
  Scenario: Verify the password is changed

    Given user opens website
    When user enters username "email" and password "password"
    And clicks on signIn button
    Then verify user successfully signed in
#    When user clicks on the profile picture
#    And clicks on change password
#    Then verify password change page is displayed
#    When user enters currentPassword "currentPassword" newPassword "newPassword" and confirmPassword "confirmNewPassword"
#    And clicks on update button
#    Then verify password changed successfully Msg is displayed