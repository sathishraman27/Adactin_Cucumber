Feature: Hotel Booking In Adactin Application

Scenario Outline: Searching stuff
Given user Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Click On The Login Button And It Navigates To Search Hotel Page

Examples:
|username|password|
|ssss|12345|
|pppp|2027|
|sathishraman27|Chennai4996#|


Scenario:
When Select location In Location Field
And Select the Hotel In Hotels Field
And Select the Room In Room Type Field
And Select the Number of rooms In Number Of Rooms Field
And Select the Check in Date In Check In Date Field
And Select the Check out Date In Check out Date Field
And Select the Adults Room In Adults Per Room Field
And Select the Children Room In Children Per Room Field
Then User Click on Search Button In Search Field	

Scenario:
When Click on the Radio Button
Then User Click on the Continue 

Scenario:
When Enter the First name in First name field
And Enter the Last name in Last name field 
And Enter the Address in the Address field
And Enter the Card number in Card number field
And Select the Card Type in the Card type field
And Select the Expiry date and Expiry year
And Enter the CVV number in the CVV field






