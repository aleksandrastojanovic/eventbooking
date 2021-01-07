package com.bynjak.eventbooking.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bynjak.eventbooking.user.dao.AdminRepository;
import com.bynjak.eventbooking.user.entity.Admin;
import com.bynjak.eventbooking.user.entity.Role;

@Service
public class AdminServiceImpl implements AdminService {

	private AdminRepository adminRepository;

	@Autowired
	public AdminServiceImpl(AdminRepository adminRepository) {
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

	public List<Admin> findByRoleEquals() {
		return adminRepository.findByRoleEquals(Role.ADMIN.toString());
	}

}
