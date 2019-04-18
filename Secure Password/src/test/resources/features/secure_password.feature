Feature: Secure password
	In order to prevent hackers from compromising member accounts
	As a privacy concerned user
	I want new members to provide a secure password then they register
	
	AC:
	The password is at least 8 characters
	The password contains at least 1 digit
	The password contains at least 1 punctuation mark
	Displays error message telling user what they did wrong if an insecure password is entered

Scenario: User enters secure password
	Given I want to create an account
	When I enter "H3lloW0rld!!!"
	Then the account is created