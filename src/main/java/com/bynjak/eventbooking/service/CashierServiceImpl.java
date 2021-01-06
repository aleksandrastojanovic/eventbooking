package com.bynjak.eventbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bynjak.eventbooking.dao.CashierRepository;
import com.bynjak.eventbooking.entity.Cashier;

@Service
public class CashierServiceImpl implements CashierService {

	private CashierRepository cashierRepository;

	@Autowired
	public CashierServiceImpl(CashierRepository cashierRepository) {
		this.cashierRepository = cashierRepository;
	}

	public Cashier findById(int id) {
		Optional<Cashier> result = cashierRepository.findById(id);

		Cashier user = null;

		if (result.isPresent()) {
			user = result.get();
		} else {
			throw new RuntimeException("User id not found: " + id);
		}
		return user;
	}

	public void save(Cashier user) {
		cashierRepository.save(user);

	}

	public void deleteById(int id) {
		cashierRepository.deleteById(id);

	}

	public List<Cashier> findAll() {
		return cashierRepository.findAll();
	}

//	public List<Cashier> findByRoleEquals(String role) {
//
//		return cashierRepository.findAll();
//	}

}
