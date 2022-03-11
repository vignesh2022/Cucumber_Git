Feature: Adactin Hotel Booking 

Scenario: User login the application
Given The User launched the Application
When The user enter the user name and password 
And User click the login button
Then The user Validate the Login is sucessful



Scenario: User will search the hotel
When user will select the location
And User will select the hotels
And user will select the room type

And user will select the no of rooms needed

And user will give the check in date

And user will give the check out date

And user will sepcify the no of adults accompanying

And  user will provide the children coming with them

Then  user will verify the details given and go for booking 


Scenario: User will confirm the hotel

When user will select the radio button

And user will continue for the booking

Then  user will validate the information provided and proceed




Scenario: User will give the personal details for booking

When user will give the firstname

And  User will give the lastname

And User will give the address

And User will give the credit card details

And User will mention the card type

And User will give the expiry month for the card

And User will provide the expiry year for the card

And User will give the cvv no for the card

Then  User will validate the details and book the hotel


