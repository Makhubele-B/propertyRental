# propertyRental
Modified Comp 167 project: a simple client-side and back-end interaction


There are 3 houses for rent near Football City, the site of the next Super Bowl. The houses are rented for NC A&T events. 
The houses can be rented for the Friday, Saturday and Sunday of the Super Bowl weekend. 
House #1 has 3BR (3 bedrooms),  3BA (3 baths) and house #2 has 1BR, 1BA and House #3 is a 2BR, 2BA

For this project, concurrency is not an issue. Assume that two customers will never access the system at exactly the same time. 
Assume that management-side software and the customer-side software will never run at the same time. 
The client side runs first, prompting the user for desired dates- Friday, Saturday or Sunday
Build a file-based reservation system enabling the following:

Management-side software:
Management controls the rental price and may change it every day. There is a change file every day; this file maybe empty, in which case there are no pricing changes. 
If the file is not empty, pricing has changed (for one or more houses, or for one or more days). The format of the change file is as follows: house ID followed by a space 
followed by the price all on one line. If there are more than one price changes, these must be listed on separate lines. This must be a simple text file. We only read the data from this file
Management-side software needs to read this file and update a different file, which controls the reservation system. 
Of course, prices for existing reservations cannot be changed.
Finally, management-side software should write to a file the status of the reservations; that is, which house is rented to whom, and for what price.

Customer-side software:
The customer-side software allows a customer to make a reservation. Prompt the customer for a possible reservation – minimum number of beds required and days required. 
Offer whatever house is available and at what price. Do not offer a customer a house that is already rented.
In this simple version, a customer makes and pays for the reservation at the same time. Also, a reservation cannot be cancelled. When a reservation is made, the customer-side software automatically updates the file controlling the reservations.

