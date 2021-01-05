package com.bynjak.eventbooking.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Admin extends User {

	public Admin(){
		super("ADMIN");
	}

	public Admin(String firstName, String lastName, String username,
			String password) {
		super("ADMIN", firstName, lastName, username, password);
	}

}
