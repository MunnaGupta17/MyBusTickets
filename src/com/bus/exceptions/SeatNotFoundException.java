package com.bus.exceptions;

public class SeatNotFoundException extends Exception {
	public SeatNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public SeatNotFoundException(String message) {
		super("seat is not available");
	}
}
