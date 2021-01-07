package com.bynjak.eventbooking.user.dao;

import java.util.List;

import com.bynjak.eventbooking.user.entity.Admin;

public interface AdminRepository extends UserRepository<Admin> {
	public List<Admin> findByRoleEquals(String role);

}
