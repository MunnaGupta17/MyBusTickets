package com.bus.exceptions;

public class BusNotFoundException extends Exception {
	public BusNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public BusNotFoundException(String message) {
		super("bus not found with this number or arrival date");
	}
}
