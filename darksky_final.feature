
@darksky
Feature: Search timeline

Scenario: Verify timline is displayed in correct format
Given I am on Darksky home page
Then I verify timeline is displayed with two hours incremented


@darksky verifying individual day temp timeline

Scenario: Verify individual day temp timeline
Given I am on Darksky Home Page
When I expand todays timeline
Then I verify lowest and highest temp is displayed correctly


