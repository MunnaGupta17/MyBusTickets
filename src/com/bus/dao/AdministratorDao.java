package com.bus.dao;

import java.util.List;

import com.bus.bean.BusDTO;
import com.bus.bean.User;
import com.bus.exceptions.UserNotFoundException;

public interface AdministratorDao {

	public User loginAdminstrator(String username, String password) throws UserNotFoundException;

	List<BusDTO> getBusesBasedOnSourceAndDestination(String source, String destination);

}
  