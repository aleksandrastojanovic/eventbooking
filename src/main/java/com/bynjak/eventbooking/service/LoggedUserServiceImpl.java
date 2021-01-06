//package com.bynjak.eventbooking.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.bynjak.eventbooking.dao.UserRepository;
//import com.bynjak.eventbooking.entity.LoggedUser;
//import com.bynjak.eventbooking.entity.User;
//
//@Service
//public class LoggedUserServiceImpl implements UserService<LoggedUser> {
//
//	private UserRepository<LoggedUser> loggedUserRespository;
//
//	@Autowired
//	public LoggedUserServiceImpl(UserRepository<LoggedUser> loggedUserRepository) {
//		this.loggedUserRespository = loggedUserRepository;
//	}
//
//	public LoggedUser findById(int id) {
//		Optional<LoggedUser> result = loggedUserRespository.findById(id);
//
//		LoggedUser user = null;
//
//		if (result.isPresent()) {
//			user = result.get();
//		} else {
//			throw new RuntimeException("User id not found: " + id);
//		}
//		return user;
//	}
//
//	public void save(LoggedUser user) {
//		loggedUserRespository.save(user);
//
//	}
//
//	public void deleteById(int id) {
//		loggedUserRespository.deleteById(id);
//
//	}
//
//	public List<LoggedUser> findAll() {
//		return loggedUserRespository.findAll();
//	}
//
////	public List<LoggedUser> findByRoleEquals(String role) {
////		
////		return loggedUserRespository.findAll();
////	}
//
//}
