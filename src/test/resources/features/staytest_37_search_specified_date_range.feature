Feature: Search for stay for specified dates 
	As a user I should be able to search stay for the a specified date range 
		So that the result lists only stays that are available of those days

Scenario: 
	Verify there should not be results wnich not meeting the searching criteria 
	Given I am on the fourstay homepage 
	When  Input search criteria, specify date in (03/01/2018) and date out (03/02/2018) and click search 
	Then I should be able to see results within the searching criteria 
	