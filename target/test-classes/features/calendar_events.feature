Feature: As a user, I want to create a recurring(repetitive) calendar event.

  Scenario Outline:
    Given user is on the home page
    When user clicks the calendar events under the activities
    And user clicks the "Create Calendar Event" button.
    And user checks the "Repeat" checkbox.
    Then user verify Repeat Every number is 1 as a default

    Examples: