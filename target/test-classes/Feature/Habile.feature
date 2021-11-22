Feature: To Verify the Cloud Bank login page

  Scenario: To Verifying the login page to entering the all pages
    Given User is on Cloud Banking login page
    When User should enter "qatest@habile.in/Qatest123$" and "12345"
    And User should click the login button
    Then User should verify "Please try again, your credentials are not valid." is displayed
