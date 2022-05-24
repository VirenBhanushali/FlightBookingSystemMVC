package com.dev.org.fbsmvc.DAO;

import java.util.List;

import com.dev.org.fbsmvc.entity.BookTicketDetails;
import com.dev.org.fbsmvc.entity.BookedTickets;
import com.dev.org.fbsmvc.entity.Flight;

public interface FlightBookingSystemDAO {
	
	public List<Flight> getAllFlights();
	
	public List<Flight> searchFlights(String source, String destination , String date);
	
	public Flight searchFlight(Integer flightNumber);
	
	public BookedTickets bookTicket(BookTicketDetails details, String date);
	
	public BookedTickets SearchTicket(Integer PNRNumber);
	
	public List<BookedTickets> getAllTickets();
	
	public Boolean cancelTicket(BookedTickets ticket);

}
