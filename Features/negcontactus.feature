Feature:  User wants to see contact Us
In order to contact with Company
As a site visitor
I want to see contact Us 

Scenario Outline: negative- User wants to see contact Us

Given new user are at the Oscommerce homepage
When user go to contact Us
And User insert "<Full Name>"and "<Enquiry>"
And insert wrong "<E-Mail Address>" 
And user Continue by click
Then User get a meassags "Your email does not appear to be valid" 

Examples:

|Full Name   | E-Mail Address       | Enquiry      |
|Kamrul Hasan| atmkhan              |Hello Testing |