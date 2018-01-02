@CreatingAccount
Feature: Creating Account as a new user
In order to became a site member 
As a new visitor 
I want to create an account in demo.oscommerce.com

@CreatingAccount
Scenario Outline:  User should be able to successfully register on website with all required fields
Given new user to the oscommerce home page
And new user wants to register for a user account 
When new user click create an account
And click "<Gender>" 
And enter "<first name>", "<last name>", "<Date of Birth>", "<E-mail Address>", "<Street Address>", "<Post Code>", "<City>","<state>","<country>","<telephone number>","<password>", "<password confirmation>"
Then new user will click continue
And new user will be automatically logged in

Examples:
|  first name 	| last name	| Date of Birth	| E-mail Address	|Street Address		 | Post Code	| City		|state          |   country	         |telephone number|  password 	| password confirmation	| 
|  Ahmed		| Safiq		| 05/21/1980	| nat@yahoo.com	    | 615 West 164 Street|10032	 	    | New York	|NY   		    |   United States    |765-5230123	  |  Abc123	    |	Abc123	            |
