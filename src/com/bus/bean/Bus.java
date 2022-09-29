package com.bus.bean;

import java.time.LocalDateTime;

public class Bus {

	private String name;
	private String number;
	private int driverId;
	private String route;
	private String type;
	private String source;
	private String destination;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;
	private int totalSeats;
	private int availableSeats;
	private boolean isAvailable;
	private int price;

	public Bus(String name, String number, String route, String type, LocalDateTime arrivalTime,
			LocalDateTime departureTime, int totalSeats, int availableSeats) {
		super();
		this.name = name;
		this.number = number;
		this.route = route;
		this.type = type;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

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

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + ", busNo=" + number + ", bus_Route=" + route + ", type=" + type + ", busArriavl="
				+ arrivalTime + ", busDeparture=" + departureTime + ", total_Seat=" + totalSeats + "]";
	}

}
