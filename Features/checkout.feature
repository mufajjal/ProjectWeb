Feature: User wants to checkout as a registered user
In order to  pay for selected product 
As a  registered user
I want to checkout my Cart by cash

Scenario Outline: Positive
Given  User is in the homepage
When user click log yourself in
And insert "<E-Mail Address>" and "<password>"
And click signin and checkout box
Then user will find delivery information page
And user will click continue and select cash on Delivery
And click continue 
Then user will find oder confirmation page
Then click Paynow
Examples:
|E-Mail Address|password|
|pat@yahoo.com |Abc123  |

