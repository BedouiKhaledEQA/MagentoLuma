Feature: Login Functionality
  @smoke
  Scenario:  Login with valid credential
    Given    User open the browser
    When     User click on signing and fill valid email and password and click on signin button
    Then     User should navigate at the homepage