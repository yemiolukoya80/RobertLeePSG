Feature: Research

  Scenario: Verify Research page
    Given user launch the browser
    When user click burger menu
    And click Research link
    Then page title should be Research | Robert Lee
    