/*
Exercise: Implement a simple ticket booking system using linked lists and Object-Oriented Programming (OOP) principles.

Requirements:

Create a Ticket class that represents a ticket in the ticket booking system.

The Ticket class should have private fields to store the ticket ID, passenger name, destination, and ticket status (e.g., booked or canceled).
Provide public getter and setter methods to access and modify the ticket properties.
Create a Node class to represent each node in the linked list.

Each node should contain a reference to a Ticket object and a reference to the next node in the list.
Create a TicketLinkedList class to implement a singly linked list of tickets.

The TicketLinkedList class should contain a private head field that points to the first node in the list.
Implement methods to add a new ticket, cancel a ticket, display all tickets, and find a ticket by its ID.
Handle edge cases like an empty list or invalid ticket IDs appropriately.
Use Object-Oriented Programming (OOP) principles:

Utilize encapsulation to ensure the internal data of the Ticket, Node, and TicketLinkedList classes are hidden and accessed through public methods only.
Implement inheritance if desired, for example, by creating a subclass of Ticket for a specific type of ticket (e.g., EconomyTicket, BusinessTicket).
Demonstrate polymorphism by defining an interface (e.g., Bookable) that declares a method (e.g., bookTicket()) to be implemented by various ticket types.
Utilize abstraction by defining an abstract class (e.g., AbstractTicket) with common properties and methods for all ticket types.
Create a simple command-line interface (CLI) for the ticket booking system:

Allow users to book a ticket by providing the passenger name and destination.
Allow users to cancel a ticket by providing the ticket ID.
Display all booked tickets with their details.
Implement additional features, like displaying only canceled tickets or finding a ticket by ID.
Test the ticket booking system:

In the main method, create an instance of the TicketLinkedList class and demonstrate various operations on the linked list.
Add some tickets, cancel a few, and display the list of booked tickets to verify the correctness of your implementation.
Note: The exercise is open-ended, and you can customize and expand the project to add more functionality or make it more sophisticated. Focus on properly designing classes, using linked lists, and applying OOP principles effectively.
  */



////////////////////Ticket Class////////////////////

public class Ticket {
	private int ticketID;
	private String passengerName;
	private String destination;
	private boolean ticketStatus;
	
	protected Ticket(int ticketID, String passengerName, String destination, boolean ticketStatus)
	{
		setTicketID(ticketID);
		setPassengerName(passengerName);
		setDestination(destination);
		setTicketStatus(ticketStatus);
	}
	public int getTicketID()
	{
		return ticketID;
	}
	public void setTicketID(int ticketID)
	{
		this.ticketID = ticketID;
	}
	public String getPassengerName()
	{
		return passengerName;
	}
	public void setPassengerName(String passengerName)
	{
		this.passengerName = passengerName;
	}
	public String getDestination()
	{
		return destination;
	}
	public void setDestination(String Destination)
	{
		this.destination = Destination;
	}
	public boolean getTicketStatus()
	{
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus)
	{
		this.ticketStatus = ticketStatus;
	}
}


////////////////////Node Class////////////////////
