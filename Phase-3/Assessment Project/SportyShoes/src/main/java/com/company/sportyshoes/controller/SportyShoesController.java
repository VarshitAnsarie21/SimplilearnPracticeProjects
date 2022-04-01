package com.company.sportyshoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.sportyshoes.dao.SportyShoesDAO;
import com.company.sportyshoes.entity.User;

@Controller
public class SportyShoesController {
	
	@Autowired
	SportyShoesDAO sportyShoesDAO;
	
	@PostMapping("/adminLogin")
	public String getUser(Model model, @RequestParam("adminemail") String adminemail, @RequestParam("adminpassword") String adminpassword) {
		
		String view = null;
		
		if(adminemail != null || adminpassword != null) {
			
		 	boolean isSuccess =  sportyShoesDAO.getAdmin(adminemail, adminpassword);
		 	
		 	if(isSuccess == true) {
	
		 		view = "adminDashboard";
		 		
		 	}else {
		 		
				view = "error";
			}
		}else {
			view = "error";
		}
		
		return view;
	}
	
	@PostMapping("/changePassword")
	public String adminCP(Model model, @RequestParam("adminpassword") String adminpassword) {
		
		String view = null;
		
		if(adminpassword == null || adminpassword.isEmpty() || adminpassword.isBlank()) {
		 	
		 	view = "errorCP";
		 	
		}else {
			
			sportyShoesDAO.changeAdminPassword(adminpassword);
		 	
		 	view = "succesfullCP";
			
		}
		
		return view;
	}
	
	@GetMapping("/listUser")
	public String seeUserList(Model model) {
		
		String view = null;
		
		List<User> userList = sportyShoesDAO.getUsers();
		
		if(userList == null || userList.isEmpty()) {
			
			view = "errorCP";
			
		}else {
			
			model.addAttribute("userList", userList);
			
			view = "listUser";
			
		}
		
		return view;
	}
	
	@PostMapping("/findUser")
	public String seeUserByName(Model model,  @RequestParam("username") String username ) {
		
		String view = null;
		
		if(username == null || username.isBlank() || username.isEmpty()) {
			
			view = "errorCP";
			
		}else {
		
			User user = sportyShoesDAO.getUserByName(username);
			
			if(user == null) {
				
				view = "errorCP";
				
			}else {
				
				model.addAttribute("user", user);
				
				view = "specificUserDetail";
				
			}
		
	   }
		
		return view;
	}
}
