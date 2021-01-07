package com.bynjak.eventbooking.user.service;

import java.util.List;

import com.bynjak.eventbooking.user.entity.User;

public interface UserService<T extends User> {

	public T findById(int id);

	public void save(T user);

	public void deleteById(int id);

	public List<T> findByRoleEquals();
}
