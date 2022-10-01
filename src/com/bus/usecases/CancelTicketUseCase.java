package com.bus.usecases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.bus.dao.CustomerDao;
import com.bus.dao.CustomerDaoImpl;
import com.bus.exceptions.BusNotFoundException;

public class CancelTicketUseCase {
	
	public static void main(String[] args) throws BusNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter busNumber");
		String busNumber = sc.nextLine();
		System.out.println("Enter Journey DateTime");
		System.out.println("Enter no of seats");
		int noOfSeats = sc.nextInt();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime journeyDateTime = LocalDateTime.parse(sc.nextLine());
        
        CustomerDao customerDao = new CustomerDaoImpl();
        System.out.println(customerDao.cancelTicket(busNumber, journeyDateTime,noOfSeats));
		
	}

}
