Feature: User wants to add product in the Cart as a registered user

In order to Add product in the cart
As a registered user
I want to add my selected product in the Cart.

Scenario: Positive
Given the new user in the homepage 
When new user click on a product
And click add to cart
And click update
Then user will find the product in shopping cart
