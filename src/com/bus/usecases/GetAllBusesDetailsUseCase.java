package com.bus.usecases;

import java.util.List;
import java.util.Scanner;

import com.bus.bean.BusDTO;
import com.bus.dao.AdministratorDao;
import com.bus.dao.AdmintratorDaoImpl;
import com.bus.exceptions.BusNotFoundException;

public class GetAllBusesDetailsUseCase {
	public static void main(String[] args) throws BusNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source");
		String source = sc.nextLine();
		System.out.println("Enter Destination");
		String destination = sc.nextLine();

		AdministratorDao adminDao = new AdmintratorDaoImpl();
		List<BusDTO> busList = adminDao.getBusesBasedOnSourceAndDestination(source, destination);
		System.out.println("Buses");
		System.out.println("=====");
		System.out.println();
		for (BusDTO i : busList) {
			System.out.println("Name -> " + i.getName() + " , type -> " + i.getType() + " , route -> " + i.getRoute()
					+ " , availableSeats -> " + i.getAvailableSeats() + " , arrivalTime-> " + i.getArrivalTime()
					+ " , departureTime - > " + i.getDepartureTime());
		}

	}
}
