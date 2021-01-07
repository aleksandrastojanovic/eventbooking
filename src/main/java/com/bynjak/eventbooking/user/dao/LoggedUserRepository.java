package com.bynjak.eventbooking.user.dao;

import java.util.List;

import com.bynjak.eventbooking.user.entity.LoggedUser;

public interface LoggedUserRepository extends UserRepository<LoggedUser> {
	public List<LoggedUser> findByRoleEquals(String role);

}
