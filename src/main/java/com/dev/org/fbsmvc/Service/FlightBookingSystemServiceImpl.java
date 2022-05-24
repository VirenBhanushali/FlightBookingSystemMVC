package com.dev.org.fbsmvc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.org.fbsmvc.DAO.FlightBookingSystemDAO;
import com.dev.org.fbsmvc.entity.BookTicketDetails;
import com.dev.org.fbsmvc.entity.BookedTickets;
import com.dev.org.fbsmvc.entity.Flight;

@Service
public class FlightBookingSystemServiceImpl implements FlightBookingSystemService {
	
	@Autowired
	FlightBookingSystemDAO dao;

	public List<Flight> getAllFlights() {
		return dao.getAllFlights();
	}

	public List<Flight> searchFlights(String source, String destination, String date) {
		return dao.searchFlights(source, destination, date);
	}

	public Flight searchFlight(Integer flightNumber) {
		return dao.searchFlight(flightNumber);
	}

	public BookedTickets bookTicket(BookTicketDetails details, String date) {
		// TODO Auto-generated method stub
		return dao.bookTicket(details, date);
	}

	public BookedTickets SearchTicket(Integer PNRNumber) {
		// TODO Auto-generated method stub
		return dao.SearchTicket(PNRNumber);
	}

	public List<BookedTickets> getAllTickets() {
		return dao.getAllTickets();
	}

	public Boolean cancelTicket(BookedTickets ticket) {
		// TODO Auto-generated method stub
		return dao.cancelTicket(ticket);
	}

}
