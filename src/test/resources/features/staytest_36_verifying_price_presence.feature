
Feature: Search for stay for price presence 
	As a guest I should be able to see prices on the stay
	     So that stay meets my price requirements


Scenario: Verify price presence 
	Given I am on the fourstay homepage 
	When I login as a guest 
	And  I go the home page 
	When   I search for hosting 
	Then I should be able to see that all stays on result list have price tag 
	
	