package com.bynjak.eventbooking.service;

import java.util.List;

import com.bynjak.eventbooking.entity.User;


public interface UserService<T extends User> {

	public List<T> findAll();
	
	public T findById(int id);

	public void save(T user);

	public void deleteById(int id);
}
