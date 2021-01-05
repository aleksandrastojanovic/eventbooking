package com.bynjak.eventbooking.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bynjak.eventbooking.entity.User;

public interface UserRepository<T extends User> extends JpaRepository<T, Integer> {
	

}
