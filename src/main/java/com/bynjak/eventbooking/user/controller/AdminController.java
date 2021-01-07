package com.bynjak.eventbooking.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bynjak.eventbooking.user.entity.Admin;
import com.bynjak.eventbooking.user.service.AdminService;

@Controller
@RequestMapping("/admins")
public class AdminController {

	private AdminService adminService;

	@Autowired
	public AdminController(AdminService adminService) {
		this.adminService = adminService;
	}

	@GetMapping("/list")
	public String listAdmins(Model theModel) {

		// retrieve all cashiers from db
		List<Admin> admins = adminService.findByRoleEquals();

		// add them to spring model
		theModel.addAttribute("admins", admins);

		return "/admins/list-admins";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Admin admin = new Admin();

		theModel.addAttribute("admin", admin);

		return "admins/admin-form";
	}


	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("admin") Admin admin) {

		// save the cashier
		adminService.save(admin);

		// use a redirect to prevent duplicate submissions
		return "redirect:/admins/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("adminId") int id,
			Model theModel) {

		// get cashier from service
		Admin admin = adminService.findById(id);

		// set cashier as a model attribute to pre-populate the form
		theModel.addAttribute("admin", admin);

		// send over to out form
		return "admins/admin-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("adminId") int id) {

		// delete the cashier
		adminService.deleteById(id);

		// redirect to cashiers-list
		return "redirect:/admins/list";
	}

}
