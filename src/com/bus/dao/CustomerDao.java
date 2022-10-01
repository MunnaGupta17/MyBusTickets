package com.bus.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.bus.bean.DriverDTO;
import com.bus.exceptions.BusNotFoundException;
import com.bus.exceptions.SeatNotFoundException;

public interface CustomerDao {

	DriverDTO bookTicket(String busNumber, LocalDateTime journeyDate, int noOfSeats) throws BusNotFoundException,SeatNotFoundException;
	

	String cancelTicket(String busNumber, LocalDateTime journeyDate,int noOfSeats) throws BusNotFoundException;
	
	

}
