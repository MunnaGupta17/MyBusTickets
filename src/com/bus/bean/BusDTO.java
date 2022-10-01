package com.bus.bean;

import java.time.LocalDateTime;

public class BusDTO {

	private String name;
	private String route;
	private String type;
	private int availableSeats;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;

	public BusDTO(String name, String route, String type, int availableSeats, LocalDateTime arrivalTime,
			LocalDateTime departureTime) {
		super();
		this.name = name;
		this.route = route;
		this.type = type;
		this.availableSeats = availableSeats;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
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

	@Override
	public String toString() {
		return "BusDTO [name=" + name + ", route=" + route + ", type=" + type + ", availableSeats=" + availableSeats
				+ ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime + "]";
	}

}
