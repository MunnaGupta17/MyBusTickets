package com.bus.usecases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.bus.bean.DriverDTO;
import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;
import com.bus.exceptions.BusNotFoundException;
import com.bus.exceptions.SeatNotFoundException;

public class BookTicketUseCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter busNumber");
		String busNumber = sc.nextLine();
		System.out.println("Enter journeyDate");
		System.out.println("Enter no of seats");
		int noOfSeats = sc.nextInt();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime journeyDate = LocalDateTime.parse(sc.nextLine());
		// BusNotFoundException,SeatNotFoundException;
		CustomerDao customerDao = new CustomerDaoImpl();
		try {
		DriverDTO driverDTO = customerDao.bookTicket(busNumber, journeyDate, noOfSeats);
		}catch(BusNotFoundException bnfe){
			System.out.println(bnfe.getMessage());
		}catch(SeatNotFoundException snfe) {
			System.out.println(snfe);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
