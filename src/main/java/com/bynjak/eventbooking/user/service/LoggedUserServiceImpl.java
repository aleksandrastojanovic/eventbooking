package com.bynjak.eventbooking.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bynjak.eventbooking.user.dao.LoggedUserRepository;
import com.bynjak.eventbooking.user.entity.LoggedUser;
import com.bynjak.eventbooking.user.entity.Role;

@Service
public class LoggedUserServiceImpl implements LoggedUserService {

	private LoggedUserRepository loggedUserRespository;

	@Autowired
	public LoggedUserServiceImpl(LoggedUserRepository loggedUserRepository) {
		this.loggedUserRespository = loggedUserRepository;
	}

	public LoggedUser findById(int id) {
		Optional<LoggedUser> result = loggedUserRespository.findById(id);

		LoggedUser user = null;

		if (result.isPresent()) {
			user = result.get();
		} else {
			throw new RuntimeException("User id not found: " + id);
		}
		return user;
	}

	public void save(LoggedUser user) {
		loggedUserRespository.save(user);

	}

	public void deleteById(int id) {
		loggedUserRespository.deleteById(id);

	}

	public List<LoggedUser> findByRoleEquals() {
		
		return loggedUserRespository.findByRoleEquals(Role.LOGGED_USER.toString());
	}



}
