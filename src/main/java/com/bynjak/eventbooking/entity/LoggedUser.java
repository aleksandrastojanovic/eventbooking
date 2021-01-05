package com.bynjak.eventbooking.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@SecondaryTable(name = "logged_user_details", pkJoinColumns = @PrimaryKeyJoinColumn(name = "user_id"))
public class LoggedUser extends User {

	@Embedded
	private UserDetails userdetails;

	public LoggedUser(){
		super("LOGGED_USER");
	}
	public LoggedUser(String firstName, String lastName, String username,
			String password, String city, String address, String email, String phoneNumber) {
		super("LOGGED_USER", firstName, lastName, username, password);
		this.userdetails = new UserDetails(city, address, email, phoneNumber);
	}

	public UserDetails getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}

}
