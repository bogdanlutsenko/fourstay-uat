@Staytest_125
Feature: Search functionality for any user 
	when I go to the FourStay home page, 
		I should be able to search for hosting 
@search 
Scenario: Search by location 
	Given  I am on the fourstay homepage 
	When   I search for hosting by location 
	Then  I should be able to see the items from that location in output 
	
@search 
Scenario: Search functionality 
	Given  I am on the fourstay homepage 
	When   I search for hosting 
	Then  I should be able to see results in the output 
	
	
	