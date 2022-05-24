package com.dev.org.fbsmvc.DAO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dev.org.fbsmvc.entity.BookTicketDetails;
import com.dev.org.fbsmvc.entity.BookedTickets;
import com.dev.org.fbsmvc.entity.Flight;

@Repository
public class FlightBookingSystemDaoImpl implements FlightBookingSystemDAO {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public List<Flight> getAllFlights() {
		List<Flight> flights =  hibernateTemplate.loadAll(Flight.class);
		return flights;
	}

	@Transactional
	public List<Flight> searchFlights(String source, String destination, String date) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println(date);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		try {
			date1 = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date1);
		int dayofWeek = date1.getDay();
		String[] weekArr = new String[] { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday",
				"saturday" };
		SQLQuery query = session.createSQLQuery("SELECT * from flights where source = :source AND destination = :destination and "+weekArr[dayofWeek] + "= 1");
		query.addEntity(Flight.class);
		query.setParameter("source", source);
		query.setParameter("destination", destination);
		List<Flight> flightList = query.list();
		return flightList;
	}

	@Transactional
	public Flight searchFlight(Integer flightNumber) {
		return hibernateTemplate.get(Flight.class, flightNumber);
	}

	@Transactional
	public BookedTickets bookTicket(BookTicketDetails details, String date) {
		Flight flight = searchFlight(details.getFlightNumber());
		int bookingId = (int) (Math.random()*1000);
		BookedTickets ticket = new BookedTickets(bookingId, details.getFlightNumber(), null, bookingId, details.getMobileNo(), details.getEmail(), details.getSeats()*flight.getRate(), null, date, null, details.getSeats(),bookingId);
		hibernateTemplate.save(ticket);
		return ticket;
	}
	@Transactional
	public BookedTickets SearchTicket(Integer PNRNumber) {
		return hibernateTemplate.get(BookedTickets.class, PNRNumber);
	}
	@Transactional
	public List<BookedTickets> getAllTickets() {
		return hibernateTemplate.loadAll(BookedTickets.class);
	}

	@Transactional
	public Boolean cancelTicket(BookedTickets ticket) {
		hibernateTemplate.delete(ticket);
		return true;
	}
	
	
	
}
