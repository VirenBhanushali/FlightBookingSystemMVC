package com.dev.org.fbsmvc.entity;

public class SearchFlightParams {
	
	public String source;
	public String destination;
	public String date;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "SearchFlightParams [source=" + source + ", destination=" + destination + ", date=" + date + "]";
	}
	
	

}
