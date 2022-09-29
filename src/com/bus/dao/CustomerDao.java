package com.bus.dao;

import java.util.List;

import com.bus.bean.BusDTO;
import com.bus.bean.DriverDTO;

public interface CustomerDao {

	DriverDTO bookTicket(BusDTO busInfo);

	String cancelTicket(BusDTO busInfo);

}
