@Regression
Feature: Registration feature

  Background: 
    Given User navigate to Asians Group URL    
    And Verify the header "ASIANS USER SYSTEM"
  
  #Need to change the new Email every time while running until create faker class
  Scenario: Verify the Register functionality
  	When User clicks on register link
  	And User Enter Email "10022023@yopmail.com"
  	And User Enter Password "abcabc"
  	And User Enter Confirm Password "abcabc"
  	And User clicks on Register button
  	Then Verify asian grous logo in home page
  	
  Scenario: Verify if system validates when Password not matching with Confirm Password
  	When User clicks on register link
  	And User Enter Email "14022023@yopmail.com"
  	And User Enter Password "abcabc"
  	And User Enter Confirm Password "abc"
  	And User clicks on Register button
  	Then Verify the message "Password confirmation doesn't match."
  	
  Scenario: Verify registering with Blank details for Registeration page fields
  	When User clicks on register link
  	And User clicks on Register button	
  	Then Verify the message "Please specify username."
  	
  Scenario: Verify registering without entering email
  	When User clicks on register link
  	And User Enter Password "abcabc"
  	And User Enter Confirm Password "abcabc"
  	And User clicks on Register button
  	Then Verify the message "Please specify username."
  	