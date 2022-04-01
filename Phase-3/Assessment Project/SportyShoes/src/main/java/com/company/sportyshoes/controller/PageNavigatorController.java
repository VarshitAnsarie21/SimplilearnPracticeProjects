package com.company.sportyshoes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageNavigatorController {

	@GetMapping("/adminCP")
	public String gotoAdminCP() {
		return "changeAdminPassword";
	}
	
	@GetMapping("/dashboard")
	public String gotoDashboad() {
		return "adminDashboard";
	}
	
	@GetMapping("/searchUser")
	public String gotoSearchUser() {
		return "searchUserPage";
	}
}
