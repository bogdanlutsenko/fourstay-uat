Feature: Search for stay for price presence 
	As a new user, I should be able to see my 
	     information displayed correctly on the user profile page.

@SpecificDate2
Scenario: User's name information should be displayed correctly 
	Given the user is on the FourStay sign up dialog 
	And the user enters enter first name "Albert" and last name "Einstein" 
	And and the user enters any unregistered email and password 
	And click on the Sign up button 
	When the user goes the account details page 
	Then first name "Albert" and last name "Einstein" should be displayed in the right fields