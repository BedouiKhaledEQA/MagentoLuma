Feature: SignUp Functionality
  @SignUp
  Scenario: Create an account
    Given   User open the browser
    When    User fill the credential and click on create an Account button
    Then    Registration should be done


  @SignUpApi
  Scenario: SignUp with Api
    Given  User open the browser
    When   Access with Api
    Then   Signup should be done