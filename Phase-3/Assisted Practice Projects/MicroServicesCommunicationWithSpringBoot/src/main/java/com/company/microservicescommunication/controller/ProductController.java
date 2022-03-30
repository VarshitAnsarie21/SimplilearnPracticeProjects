package com.company.microservicescommunication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.microservicescommunication.entity.ProductEntity;
import com.company.microservicescommunication.response.ProductResponse;
import com.company.microservicescommunication.service.ProductService;

@RestController
@RequestMapping(path = "/webapi") 
public class ProductController {

    @Autowired
    ProductService productService;
    
    @RequestMapping("/person/{personId}")
    public ProductResponse getPerson(@PathVariable int personId){
        return productService.getResponse(personId);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/person")   
    public void addPerson(@RequestBody ProductEntity pe ) {
    	productService.addPerson(pe);
    }


}
