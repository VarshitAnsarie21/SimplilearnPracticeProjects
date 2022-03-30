package com.company.jdbc.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.jdbc.dao.EProductDAO;
import com.company.jdbc.entity.EProduct;

@Controller
public class EProductController {
	
	@Autowired
	EProductDAO eproductDAO;
	
	//@GetMapping("/listProducts")
	@RequestMapping(value = "/listProducts", method = RequestMethod.GET)
	public String listProducts(Model model) {
		
		List<EProduct> products = eproductDAO.getProducts();
		model.addAttribute("products", products);
		
		return "listProducts";
	}
}
