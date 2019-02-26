CRC Cards:

1. Class Name: Customer
   Responsibilities:
	Know -
		-- Customer Name, Phone number and party size
	Do -
		-- Register by providing party details.
		-- STOP further messages
		-- CONFIRM or LEAVE table
   Collaborators: 
	-- ReservationManager

2. Class Name: ReservationManager
   Responsibilites:
	Know - 
		-- Customers in waitlist
	Do -  
   	 	-- Receives registration details, add party in the waitlist and sends initial message
   		-- If STOP receieved in reply, remove the party from the waitlist
   		-- Check for free table of this capacity(party size)
		-- If free table of this capacity is available, sends the second message to the customer
		-- If LEAVE received in reply, remove the party from the waitlist and sends the second message to the next available customer in the waitlist where party size is
		   less than the capacity of the table
		-- If CONFIRM received in reply, allocate the table
   Collaborators:
	-- Customer, TableManager

3. Class Name: TableManager
   Responsibilites:
	Know -
	Do - 
		-- Check if any free table to accomodate the party size
		-- Confirm free table is there
		-- Allocate the table
   Collaborators:
	-- Table, ReservationManager

4. Class Name: Table
   Responsibilites:
	Know - Table size, Table Availability State
	Do -
		-- Set table state
		-- Return table state
   Collaborators:
	-- TableManager

Design Patterns:

1. State - The table object maintains 2 states (Available and Occupied) which it sends to the tableManager when requested for. Please refer state class diagram
   Participants - 
		-- Context - Table
		-- State - TableState(Interface)
		-- ConcreteState subclasses - AvailableState, OccupiedState

2. Chain of responsibility - ReservationManager object doesn't knows which customer will confirm/leave the table. In this case chain of responsibility design pattern can be used
   Participants - 
		-- Client - ReservationManager. Handler and ConcreteHandler could be implemented based on the response (Leave/Confirm) message.
