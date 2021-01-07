package com.bynjak.eventbooking.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bynjak.eventbooking.user.dao.CashierRepository;
import com.bynjak.eventbooking.user.entity.Cashier;
import com.bynjak.eventbooking.user.entity.Role;

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

	public List<Cashier> findByRoleEquals() {
		return cashierRepository.findByRoleEquals(Role.CASHIER.toString());
	}


}
