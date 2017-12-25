Feature: Search for stay with different beds number 
	As a guest when I search for stay 
	     I should be able to see different results number when I'm changing number of beds
	     So that stay meets my beds requirements


Scenario: Verify results are changing according to number of beds 
	Given I am on the fourstay homepage 
	When   I search for hosting 
	Then    	When I'm changing number of beds I should be able to see that number of results updates 
	