package com.bynjak.eventbooking.user.entity;

import javax.persistence.Column;
//import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@SecondaryTable(name = "location", pkJoinColumns = @PrimaryKeyJoinColumn(name = "cashier_id"))
public class Cashier extends User {
	
	@Column(name="location_name", table="location")
	private String locationName;
	
	@Column(name="location_address", table="location")
	private String locationAddress;
	
	@Column(name="location_city", table="location")
	private String locationCity;

	public Cashier() {
		super(Role.CASHIER.toString());
	}

	public Cashier(String firstName, String lastName, String username,
			String password, String locationName, String locationCity, String locationAddress) {
		super(Role.CASHIER.toString(), firstName, lastName, username, password);
		this.locationCity = locationCity;
		this.locationName = locationName;
		this.locationAddress = locationAddress;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}



}
