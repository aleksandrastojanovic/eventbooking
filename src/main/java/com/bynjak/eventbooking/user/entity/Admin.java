package com.bynjak.eventbooking.user.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Admin extends User {

	public Admin(){
		super(Role.ADMIN.toString());
	}

	public Admin(String firstName, String lastName, String username,
			String password) {
		super(Role.ADMIN.toString(), firstName, lastName, username, password);
	}

}
