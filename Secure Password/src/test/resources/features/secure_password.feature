Feature: Secure password
	In order to prevent hackers from compromising member accounts
	As a privacy concerned user
	I want new members to provide a secure password then they register

Scenario: User enters secure password
	Given I want to create an account
	When I enter <password>
	Then the account is created	