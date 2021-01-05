package com.bynjak.eventbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bynjak.eventbooking.dao.UserRepository;
import com.bynjak.eventbooking.entity.Admin;

@Service
public class AdminServiceImpl implements UserService<Admin> {

	private UserRepository<Admin> adminRepository;

	@Autowired
	public AdminServiceImpl(UserRepository<Admin> adminRepository) {
		this.adminRepository = adminRepository;
	}

	public Admin findById(int id) {
		Optional<Admin> result = adminRepository.findById(id);

		Admin user = null;

		if (result.isPresent()) {
			user = result.get();
		} else {
			throw new RuntimeException("User id not found: " + id);
		}
		return user;
	}

	public void save(Admin user) {
		adminRepository.save(user);

	}

	public void deleteById(int id) {
		adminRepository.deleteById(id);

	}

	public List<Admin> findAll() {
		return adminRepository.findAll();
		
	}

}
