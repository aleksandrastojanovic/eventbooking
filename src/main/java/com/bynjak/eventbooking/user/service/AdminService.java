package com.bynjak.eventbooking.user.service;

import java.util.List;

import com.bynjak.eventbooking.user.entity.Admin;

public interface AdminService extends UserService<Admin> {
	public List<Admin> findAll();

}
