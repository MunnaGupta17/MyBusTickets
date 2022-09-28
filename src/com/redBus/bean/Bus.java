package com.redBus.bean;

import java.time.LocalDateTime;

public class Bus {
	
	private String name;
	private String busNo;
	private String bus_Route;
	private String type;
	private LocalDateTime busArriavl;
	private LocalDateTime busDeparture;
	private int total_Seat;
	public Bus(String name, String busNo, String bus_Route, String type, LocalDateTime busArriavl,
			LocalDateTime busDeparture, int total_Seat) {
		super();
		this.name = name;
		this.busNo = busNo;
		this.bus_Route = bus_Route;
		this.type = type;
		this.busArriavl = busArriavl;
		this.busDeparture = busDeparture;
		this.total_Seat = total_Seat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBus_Route() {
		return bus_Route;
	}
	public void setBus_Route(String bus_Route) {
		this.bus_Route = bus_Route;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getBusArriavl() {
		return busArriavl;
	}
	public void setBusArriavl(LocalDateTime busArriavl) {
		this.busArriavl = busArriavl;
	}
	public LocalDateTime getBusDeparture() {
		return busDeparture;
	}
	public void setBusDeparture(LocalDateTime busDeparture) {
		this.busDeparture = busDeparture;
	}
	public int getTotal_Seat() {
		return total_Seat;
	}
	public void setTotal_Seat(int total_Seat) {
		this.total_Seat = total_Seat;
	}
	@Override
	public String toString() {
		return "Bus [name=" + name + ", busNo=" + busNo + ", bus_Route=" + bus_Route + ", type=" + type
				+ ", busArriavl=" + busArriavl + ", busDeparture=" + busDeparture + ", total_Seat=" + total_Seat + "]";
	}
	
	
	

	
}
