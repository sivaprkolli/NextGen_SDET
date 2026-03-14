Feature: Login feature

  @LT1 @ADO123
  Scenario: Verify login success with valid credentials
    Given user on the launch page
    When user enter login credentials
    And user click on login button
    Then user products screen displayed


  @LT2 @ADO678
  Scenario: Verify login success with valid credentials with direct data
    Given user on the launch page
    When user enter login credentials "standard_user" and "secret_sauce"
    And user click on login button
    Then user products screen displayed


  @LT3 @ADO679
  Scenario Outline: Verify login success with valid credentials using examples
    Given user on the launch page
    When user enter login credentials "<username>" and "<password>"
    And user click on login button
    Then user products screen displayed

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | locked_out_user         | secret_sauce |

  @LT4 @ADO645
  Scenario: Verify login success with valid credentials - data without header
    Given user on the launch page
    When user enter signIn credentials
      | locked_out_user | secret_sauce |
    And user click on login button
    Then user products screen displayed

  @LT5 @ADO676
  Scenario: Verify login success with valid credentials - data with header
    Given user on the launch page
    When user enter valid login credentials
      | username                | password     |
      | performance_glitch_user | secret_sauce |
    And user click on login button
    Then user products screen displayed