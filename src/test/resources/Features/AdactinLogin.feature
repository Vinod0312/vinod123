Feature: Validation of Adactin hotel app. 

 
 
Scenario Outline: TC01-Validation of login page with  valid Username and valid password
Given User launch Adactin hotel application.
When User enters valid "<Username>" and valid "<password>"
And User clicks login button
Then User verify the search hotel page displayed
Examples:

|Username |password|
|Vinodkumar123|29TQ93|

Scenario Outline: TC02-Validation of login page with invalid Username and invalid password
Given User launch Adactin hotel application.
When User enters invalid "<Username>" and invalid "<password>"
And User clicks login button
Then User verify the Error message  displayed
Examples:
|Username |password|
|Vinod123|trytu|


Scenario Outline: TC03-Validation of login page with valid Username and valid password
Given User launch Adactin hotel application.
When User enters valid "<Username>" and valid "<password>"
And User clicks login button
Then User verify the search hotel page displayed  
When User selects the "<Locations>","<Hotels>","<Room Type>","<No of Rooms>","<Check in Date>","<Check out Date>","<Adults per Room>","<Childrens per Room>".
And User clicks search button
Then User verify the select hotel page displayed
And User click Select button and continue button
Then User verify the Book A Hotel page displayed
When User enters "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit card Type>","<Select Month>","<Select Year>","<cvv no>"
And User click Book Now button
Then User verifies the booked order id displayed



Examples:
|Username |password|Locations|Hotels|Room Type|No of Rooms|Check in Date|Check out Date|Adults per Room|Childrens per Room|First Name |Last Name|Billing Address|Credit Card No|Credit card Type|Select Month|Select Year|cvv no|
|Vinodkumar123|29TQ93|Sydney|Hotel Sunshine|Deluxe|2 - Two|22/05/2-022|23/05/2022|2 - Two|1 - One|vinod|kumar|chennai|1234567890123456|VISA|June|2022|654|

 




