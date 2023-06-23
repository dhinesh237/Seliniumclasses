Feature: To validate the login Functionality of fb app

Background:
Given to launch the chrome browser and max the window

Scenario: To validate the valid username and invalid passwrd
When To launch url of fb app
And  To pass valid username in email field
And To pass invalid passwrd in password field
And To click the login button
And To check whether it navigate to the homepage or not
Then To close browser

Scenario Outline: To validate the positive and negative combination of login
When User has to hit the fb url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<pasworddatas>" in password field
And User has to click the login button
Then User has to close the browser

Examples:
|emaildatas        |passworddatas|
|selenium@gmail.com|12345        |
|testing@gmail.com |0987765      |
|abcd@gmail.com    |asdfghj      |
|joker@gmail.com   |batman       |