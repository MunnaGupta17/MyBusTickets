package com.bus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.bus.bean.BusDTO;
import com.bus.bean.User;
import com.bus.exceptions.BusNotFoundException;
import com.bus.exceptions.UserNotFoundException;
import com.bus.utility.DBUtil;

public class AdmintratorDaoImpl implements AdministratorDao {

	@Override
	public User loginAdminstrator(String username, String password) throws UserNotFoundException {

		User user = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from user where email = ? AND password = ?");

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				String name = rs.getString("name");
				user = new User();
				user.setName(name);

			} else
				throw new UserNotFoundException("Invalid Username or password.. ");

		} catch (SQLException e) {
			throw new UserNotFoundException(e.getMessage());
		}

		return user;
	}

	@Override
	public List<BusDTO> getBusesBasedOnSourceAndDestination(String source, String destination)
			throws BusNotFoundException {
		List<BusDTO> busList = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from bus where source = ? AND destination = ?");

			ps.setString(1, source);
			ps.setString(2, destination);

			ResultSet rs = ps.executeQuery();
			try {
				if (rs.next()) {

					Timestamp timestamp = rs.getTimestamp("arrivalTime");
					LocalDateTime arrivalTime = timestamp.toLocalDateTime();

					Timestamp timestamp1 = rs.getTimestamp("arrivalTime");
					LocalDateTime departureTime = timestamp1.toLocalDateTime();

					BusDTO busDTO = new BusDTO(rs.getString("name"), rs.getString("route"), rs.getString("type"),
							rs.getInt("availableSeats"), arrivalTime, departureTime);
					busList.add(busDTO);

				} else
					throw new BusNotFoundException("No buses available ");
			} catch (BusNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (SQLException e) {
			throw new BusNotFoundException(e.getMessage());
		}

		return busList;
	}

}

//5 buses   9 user (1 admin,5 driver,3 customer)