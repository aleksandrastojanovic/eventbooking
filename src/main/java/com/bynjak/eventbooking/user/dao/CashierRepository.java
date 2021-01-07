package com.bynjak.eventbooking.user.dao;

import java.util.List;

import com.bynjak.eventbooking.user.entity.Cashier;

public interface CashierRepository extends UserRepository<Cashier> {
	public List<Cashier> findByRoleEquals(String role);

}
