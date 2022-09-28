package com.redBus.bean;

public class User {

	private String name;
	private String email;
	private String password;
	private String userType; // it can be user or customer or it can be driver also
	private String phone;
	private String address;

	public User() {

	}

	public User(String name, String email, String password, String userType, String phone, String address) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", userType=" + userType
				+ ", phone=" + phone + ", address=" + address + "]";
	}

}
