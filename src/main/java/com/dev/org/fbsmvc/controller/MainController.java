package com.dev.org.fbsmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dev.org.fbsmvc.Service.FlightBookingSystemService;
import com.dev.org.fbsmvc.entity.BookTicketDetails;
import com.dev.org.fbsmvc.entity.BookedTickets;
import com.dev.org.fbsmvc.entity.Flight;
import com.dev.org.fbsmvc.entity.SearchFlightParams;
import com.dev.org.fbsmvc.entity.SelectedFlight;

@Controller
public class MainController {
	
	@Autowired
	FlightBookingSystemService service;
	String journeyDate = "";
	
	@RequestMapping("/getAllFlights")
	public String getAllFlights(ModelMap model){
		List<Flight> flights = service.getAllFlights();
		model.addAttribute("flightList", flights);
		return "displayAllFlights";
		
	}
	
	@RequestMapping("/home")
	public String displayHome(ModelMap model){
		return "Home";
		
	}
	
	@RequestMapping(value = "/searchFlight", method = RequestMethod.POST)
	public String searchFlight(@ModelAttribute("searchFlightParams") SearchFlightParams params,ModelMap model){
	List<Flight> searchFlights = service.searchFlights(params.source, params.destination, params.date);
	model.addAttribute("flightList", searchFlights);
	journeyDate = params.date;
		return "DisplaySearchedFlights";
	}
	
	
	@RequestMapping(value = "/fillDetails" , method = RequestMethod.POST)
	public String fillForm(@ModelAttribute ("selectedFlight") SelectedFlight flightNumber, ModelMap model){
		Flight flight = service.searchFlight(flightNumber.getSelectedFlight());
		model.addAttribute("selectedFlight", flight);
		return "fillDetailsPage";
	}
	
	@RequestMapping(value="/bookTicket", method = RequestMethod.POST)
	public String bookTicket(@ModelAttribute("bookTicketDeatails") BookTicketDetails details, ModelMap model){
		System.out.println(details);
		BookedTickets ticket = service.bookTicket(details, journeyDate);
		model.addAttribute("PNR", ticket.getPNRNumber());
		return "bookTicket";
		
	}
	
	@RequestMapping(value = "/searchTicket" , method = RequestMethod.GET)
	public String searchTicket(@RequestParam(value="id")String id,ModelMap model){
		System.out.println(id);
		BookedTickets ticket = service.SearchTicket(Integer.parseInt(id));
		System.out.println(ticket);
		model.addAttribute("ticket",ticket);
		Flight flight = service.searchFlight(ticket.getFlightDetails());
		model.addAttribute("flight",flight);
		return "searchedTicket";
	}
	
	@RequestMapping("/getAllTickets")
	public String getAllTickets(ModelMap model){
		List<BookedTickets> ticketList = service.getAllTickets();
		model.addAttribute("tickets", ticketList);
		for(BookedTickets ticket : ticketList){
			System.out.println(ticket);
		}
		return "allTickets";
	}
	
	@RequestMapping(value = "/cancelTicket" , method = RequestMethod.GET)
	public String cancelTicket(@RequestParam(value="id")String id,ModelMap model){
		System.out.println(id);
	    BookedTickets ticket = service.SearchTicket(Integer.parseInt(id));
		
		System.out.println(ticket);
		service.cancelTicket(ticket);
		model.addAttribute("ticket",ticket);
		return "cancelTicket";
	}
}
