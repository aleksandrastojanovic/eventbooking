package com.bynjak.eventbooking.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@SecondaryTable(name = "logged_user_details", pkJoinColumns = @PrimaryKeyJoinColumn(name = "user_id"))
public class LoggedUser extends User {

	@Column(name = "city", table = "logged_user_details")
	private String city;

	@Column(name = "address", table = "logged_user_details")
	private String address;

	@Column(name = "email", table = "logged_user_details")
	private String email;

	@Column(name = "phone_number", table = "logged_user_details")
	private String phoneNumber;

	public LoggedUser() {
		super(Role.LOGGED_USER.toString());
	}

	public LoggedUser(String firstName, String lastName, String username,
			String password, String city, String address, String email,
			String phoneNumber) {
		super(Role.LOGGED_USER.toString(), firstName, lastName, username,
				password);
		this.city = city;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
