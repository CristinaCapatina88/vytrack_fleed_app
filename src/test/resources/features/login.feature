Feature: user should be able to login and using correct credentials
@wip
  Scenario Outline:
    Given user is on the login page
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should see "Dashboard" title

    Examples: valid Credentials
      | username | password |
      | user1 | UserUser123 |
      | salesmanager120 | UserUser123 |
      | storemanager85 | UserUser123|