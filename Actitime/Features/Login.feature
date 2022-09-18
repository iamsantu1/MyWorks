Feature: Login

  Scenario: Successful Login with valid Credentials
    Given User Launch Chrome browser
    When User opens URL "http://localhost:82/login.do"
    And User enters Username as "admin" and password  as "manager"
    And Click on Login
    When Click on Logout
    And close browser