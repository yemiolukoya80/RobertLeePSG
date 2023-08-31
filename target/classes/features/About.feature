Feature: About Mr Robert Lee Page

  Scenario: Verify About Mr Robert Lee page
    Given user launch the browser
    When user click burger menu
    And click about link
    Then page title should be About | Robert Lee
    