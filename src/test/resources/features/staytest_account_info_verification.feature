@Regression
Feature: Account info verification 
	As as user, when I log in to the FourStay,
  I should be able to see correct information in the account settings

Scenario Outline: Verify user information 
	Given I am on the fourstay login dialog 
	And I enter email "<email>" 
	And I enter password "<password>" 
	When I click on the login button 
	When the user goes the account details page 
	Then the user first name, last name and phone number should be as in database 
	 
	
	Examples: 
		| email                 | password |
		| sking@testmail.com    | password |
		| dlorentz@testmail.com | password |
        | daustin@testmail.com  | password |
        | isciarra@testmail.com | password |	
        | imikkili@testmail.com | password |
        | jnayer@testmail.com   | password |
        | shiggins@testmail.com | password |
        | acabrio@testmail.com  | password |
        | rperkins@testmail.com | password |
        | doconnel@testmail.com | password |
		
		
		