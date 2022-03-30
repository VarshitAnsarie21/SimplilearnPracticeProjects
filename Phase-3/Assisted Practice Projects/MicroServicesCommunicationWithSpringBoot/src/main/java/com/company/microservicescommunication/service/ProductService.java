package com.company.microservicescommunication.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.microservicescommunication.entity.ProductEntity;
import com.company.microservicescommunication.repository.ProductRepository;
import com.company.microservicescommunication.response.ProductResponse;

@Service
public class ProductService {
	
	@Autowired
    ProductRepository productRepository;
    
    RestTemplate restTemplate = new RestTemplate();
        
    public ProductResponse getResponse(int personId){
        final String uri = "http://localhost:8082/webapitwo/hobby/{personId}";
        
         Map<String, Integer> params = new HashMap<String, Integer>();
         params.put("personId", personId);
         
         String result = restTemplate.getForObject(uri, String.class, params);
         ProductEntity pe=productRepository.findById(personId).get();
         ProductResponse pr=new ProductResponse();
         pr.setId(pe.getId());
         pr.setName(pe.getName());
         pr.setType(result);
        
        return pr;
    }   
    public void addPerson(ProductEntity pe){
        productRepository.save(pe);
    }

}
