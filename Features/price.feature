Feature: User wants to check the price of the product in Euro
In order to purchase a product 
As a  user of the site
I want to check the price in Euro

Scenario: Positive
Given new user is in the homepage.
When user click currencies
And select Euro
Then user will see the product price in Euro
