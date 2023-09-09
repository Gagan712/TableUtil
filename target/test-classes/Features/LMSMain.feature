#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Home Page Verification

  @tag1
  Scenario: Verify Admin is on Home Page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should land on the home page

  Scenario: Verify the invalid URL of Home Page
    Given Admin launch the browser
    When Admin gives the invalid LMS portal URL
    Then Admin should recieve 404 page not found error

  Scenario: Verify for broken link
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then HTTP response >=400.The link is broken

  Scenario: Verify the text spelling in the Home Page
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see correct spelling in all fields
    
  Scenario: Verify the logo of LMS
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin see correct logo of the LMS

  Scenario: Verify the alignment of LMS logo
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see logo is properly aligned 

  Scenario: Verify the presence of login button
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should see login button

  Scenario: Verify login button is clickable
    Given Admin launch the browser
    When Admin gives the correct LMS portal URL
    Then Admin should able to click the Login button

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
      