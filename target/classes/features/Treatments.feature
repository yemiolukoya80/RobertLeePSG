Feature: Treatments

  Scenario: Verify Treatments page
    Given user launch the browser
    When user click burger menu
    And click Treatments link
    Then page title should be Treatments | Robert Lee
    