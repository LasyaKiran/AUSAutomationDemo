@Regression
Feature: Login page feature

  Background: 
    Given User navigate to Asians Group URL    
    And Verify the header "ASIANS USER SYSTEM"
 
  Scenario: Verify all the fields available in login page
  	Then Verify all fields in login page

  	      
  Scenario: Verify the user able to login with valid Email and Password
  	When User Enter username "19022023@yopmail.com"
  	And User Enter Password "abcabc"
  	And Click on Sign In button
  	Then Verify asian grous logo in home page 
  	
  Scenario: Verify if user able to login with a valid username and an invalid password
  	When User Enter username "19022023@yopmail.com"
  	And User Enter Password "abc"
  	And Click on Sign In button
  	Then Verify the inline error message "Invalid username or password."
  	
  Scenario: Verify the error message when Email and Password fields are Blank and click on Sign in button
  	And Click on Sign In button
  	Then Verify the inline error message "Invalid username or password."
  	
  Scenario: Verify the Forget Password functionality
  	When User clicks on forgot password link
  	And User Enter username "180220233@yopmail.com"
  	And User clicks on Submit button
  	Then Verify the message "You should receive an email shortly with further instructions."
  	
  Scenario: Verify the Language Selection
  	When user clicks on language selection dropdown
  	And user selects "japanese" language
  	Then verify the language "日本語"
  	When user clicks on language selection dropdown
  	And user selects "kr" language
  	Then verify the language "kr"
  	When user clicks on language selection dropdown
  	And user selects "English" language
  	Then verify the language "English"
  	When user clicks on language selection dropdown
  	And user selects "chinese" language
  	Then verify the language "中文简体"
  	
  