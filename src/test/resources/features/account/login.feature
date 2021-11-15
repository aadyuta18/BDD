Feature: Login functional in Linkendin
  As a Linkedin user
  I want to see my timeline
  So that I can like or comment my friend post


  Scenario: Login Success
    Given I am on the Login Page
    When I enter my username and password correctly
    And I click 'Login' button
    Then I am taken to the dashboard

  Scenario: Login with empty email and password
    Given I am already on the Login Page with case empty email and password
    When I enter username and password with case empty email and password
    And I click 'Login' button with case empty email and password
    Then I failed to login to the dashboard with case empty email and password

  Scenario: Login with valid email and empty password
    Given I already on the Login Page with case valid email and empty password
    When I enter username and password with case valid email and empty password
    And I click 'Login' button with case valid email and empty password
    Then I failed to login to the dashboard linkedin with case valid email and empty password

  Scenario: Login with empty email and valid password
    Given I already on the Login Page with case empty email and valid password
    When I enter username and password with case empty email and valid password
    And I click 'Login' button with case empty email and valid password
    Then I failed to login to the dashboard linkedin with case empty email and valid password

  Scenario: Login with invalid email and valid password
    Given I already on the Login Page with case invalid email and valid password
    When I enter username and password with case invalid email and valid password
    And I click 'Login' button with case invalid email and valid password
    Then I failed to login to the dashboard linkedin with case invalid email and valid password

  Scenario: Login with valid email and invalid password
    Given I already on the Login Page with case valid email and invalid password
    When I enter username and password with case valid email and invalid password
    And I click 'Login' button with case valid email and invalid password
    Then I failed to login to the dashboard linkedin with case valid email and invalid password