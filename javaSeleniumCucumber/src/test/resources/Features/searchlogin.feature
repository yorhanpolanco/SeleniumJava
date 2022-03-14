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
Feature: Search

  @tag1
  Scenario: user searches dummy login page in google
    Given user is in google page
    When user is in google page
    And user submint search
    Then google returns result

  @tag2
  Scenario Outline: the user tries to log in on a dummy login page
    Given user is in google result
    When user clicks in the link of dummy login page
   # And enters <user> and <password>
    And user click on login button
    Then the web page shows a confirmation message

   # Examples: 
    #  | user | password |
     # | u1   | pass1    |
