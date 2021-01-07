package com.bynjak.eventbooking.user.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bynjak.eventbooking.user.entity.User;

public interface UserRepository<T extends User> extends
		JpaRepository<T, Integer> {

}
