package com.bynjak.eventbooking.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@SecondaryTable(name = "location", pkJoinColumns = @PrimaryKeyJoinColumn(name = "cashier_id"))
public class Cashier extends User {

	@Embedded
	private Location location;

	public Cashier() {
		super("CASHIER");
	}

	public Cashier(String firstName, String lastName, String username,
			String password, String locationName, String locationCity, String locationAddress) {
		super("CASHIER", firstName, lastName, username, password);
		this.location = new Location(locationName, locationCity, locationAddress);
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
