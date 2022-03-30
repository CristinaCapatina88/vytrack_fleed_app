Feature:  As a user, I want to create a recurring(repetitive) calendar event.
Background: login for each step


  @wip
  Scenario Outline:
    Given user logs in using "<username>" and "<password>"
    When user clicks the calendar events under the activities
    And user clicks the Create Calendar Event button.
    And user checks the Repeat checkbox.
    Then user verify Repeat Every number is "1" as a default

    Examples: valid Credentials
      | username | password |
      | user1 | UserUser123 |
      | salesmanager120 | UserUser123 |
      | storemanager85 | UserUser123|


