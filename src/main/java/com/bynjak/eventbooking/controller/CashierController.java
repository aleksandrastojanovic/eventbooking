package com.bynjak.eventbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bynjak.eventbooking.entity.Cashier;
import com.bynjak.eventbooking.service.CashierService;

@Controller
@RequestMapping("/cashiers")
public class CashierController {

	private CashierService cashierService;

	@Autowired
	public CashierController(CashierService cashierService) {
		this.cashierService = cashierService;
	}

	@GetMapping("/list")
	public String listcashiers(Model theModel) {

		// retrieve all cashiers from db
		List<Cashier> cashiers = cashierService.findAll();

		// add them to spring model
		theModel.addAttribute("cashiers", cashiers);

		return "/cashiers/list-cashiers";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Cashier cashier = new Cashier();

		theModel.addAttribute("cashier", cashier);

		return "cashiers/cashier-form";
	}

	@GetMapping("/showFormForAddCashier")
	public String showFormForAddCashier(Model theModel) {

		// create model attribute to bind form data
		Cashier cashier = new Cashier();

		theModel.addAttribute("cashier", cashier);

		return "cashiers/cashier-form";
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("cashier") Cashier cashier) {

		// save the cashier
		cashierService.save(cashier);

		// use a redirect to prevent duplicate submissions
		return "redirect:/cashiers/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("cashierId") int id,
			Model theModel) {

		// get cashier from service
		Cashier cashier = cashierService.findById(id);

		// set cashier as a model attribute to pre-populate the form
		theModel.addAttribute("cashier", cashier);

		// send over to out form
		return "cashiers/cashier-form";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("cashierId") int id) {

		// delete the cashier
		cashierService.deleteById(id);

		// redirect to cashiers-list
		return "redirect:/cashiers/list";
	}

}
