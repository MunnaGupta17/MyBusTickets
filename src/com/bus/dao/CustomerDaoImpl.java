package com.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import com.bus.bean.DriverDTO;
import com.bus.exceptions.BusNotFoundException;
import com.bus.exceptions.SeatNotFoundException;
import com.bus.utility.DBUtil;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public DriverDTO bookTicket(String busNumber, LocalDateTime journeyDate, int noOfSeats)
			throws SeatNotFoundException, BusNotFoundException {
		DriverDTO driver = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from bus where number = ? AND arrival_time = ?");

			ps.setString(1, busNumber);
			ps.setString(2, journeyDate.toString());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int availableSeats = rs.getInt("available_seats");
				if (availableSeats < noOfSeats) {
					throw new SeatNotFoundException("Seats are not avaiable");
				} else {
					ps = conn
							.prepareStatement("update bus set available_seats=? where number = ? AND arrival_time = ?");
					ps.setInt(1, availableSeats - noOfSeats);

					ps.setString(2, busNumber);

					ps.setString(3, journeyDate.toString());
					ps.executeUpdate();

					ps = conn.prepareStatement("select * from user where id = ?");
					ps.setInt(1, rs.getInt("driver_id"));
					ResultSet rs1 = ps.executeQuery();
					if (rs1.next()) {
						driver = new DriverDTO(rs1.getString("name"), rs1.getString("phone"), rs1.getString("email"));
					}
				}

			} else
				throw new BusNotFoundException("Invalid bus number.. ");

		} catch (SQLException e) {
			throw new BusNotFoundException(e.getMessage());
		}

		return driver;
	}

	@Override
	public String cancelTicket(String busNumber, LocalDateTime journeyDate, int noOfSeats) throws BusNotFoundException {
		String msg = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from bus where number = ? AND arrival_time = ?");

			ps.setString(1, busNumber);
			ps.setString(2, journeyDate.toString());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int availableSeats = rs.getInt("available_seats");
				ps = conn
						.prepareStatement("update bus set available_seats=? where number = ? AND arrival_time = ?");
				ps.setInt(1, availableSeats + noOfSeats);
				ps.setString(2, busNumber);
				ps.setString(3, journeyDate.toString());
				ps.executeUpdate();
				msg = "ticket canceled successfully";

			} else
				throw new BusNotFoundException("Invalid bus number.. ");

		} catch (SQLException e) {
			throw new BusNotFoundException(e.getMessage());
		}

		return msg;
	}

}
