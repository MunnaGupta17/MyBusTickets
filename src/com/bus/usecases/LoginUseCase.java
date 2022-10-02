package com.bus.usecases;

import java.util.Scanner;

import com.bus.bean.User;
import com.bus.dao.AdministratorDao;
import com.bus.dao.AdmintratorDaoImpl;
import com.bus.exceptions.UserNotFoundException;

public class LoginUseCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter email:");
		String uname = sc.next();

		System.out.println("Enter Password:");
		String pass = sc.next();

		AdministratorDao dao = new AdmintratorDaoImpl();

		try {
			User user = dao.loginAdminstrator(uname, pass);

			System.out.println("Login successful for user :" + user.getName());

		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
