Feature: To validate the account creation of fb application

Scenario: To create new account
Given To launch the chrome browser and maximise window
When To launch the url of fb app
And To click the create new account button
And To pass firstname in firstname text box
|selein||
And To pass secondname in secondname text box
And To pass phno or email in email text box
|abcdef@gmail.com|123456789|sdfghjkj@gmail.com|12345678909|
|automation@     |1234566  |iphones@gmail.com |23456788765| 
|always@gmail.com|123433556|zxcgf@gmail.com   |2345 678765|
And To create new password using new password text box
Then To close the chrome browser
