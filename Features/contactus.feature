Feature:  User wants to see contact Us
In order to contact with Company
As a site visitor
I want to see contact Us 

Scenario Outline: Positive- User wants to see contact Us

Given new user are at the homepage of Oscommerce
When user click contact Us
And User insert "<Full Name>"and "<E-Mail Address>" and "<Enquiry>"
Then user Click Continue
And User will get confirmation meassags "Your enquiry has been successfully sent to the Store Owner" 

Examples:

|Full Name   | E-Mail Address       | Enquiry      |
|Kamrul Hasan| atmkhan@gmail.com    |Hello Testing |