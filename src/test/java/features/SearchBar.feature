Feature: SearchBar Functionality
  @Search @smoke
  Scenario: Search item via flex search
    Given User open the browser
    When  User fill the items word looking for
    Then  Item suggestion should be displayed
    When  User click on result search
    Then  Result lookin for should be displayed