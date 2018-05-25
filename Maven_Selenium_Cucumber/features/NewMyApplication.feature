Feature: Test Facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open Chrome and start application
    When I enter valid "<username>"
    And valid "<password>"
    Then user should be able to login successfully

    Examples: 
      | username              | password |
      | testuser13@gmail.com  | abcd1234 |
      | testuser131@gmail.com | abcd2345 |
      | testuser132@gmail.com | abcd3456 |
