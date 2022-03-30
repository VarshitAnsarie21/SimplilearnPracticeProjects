package com.company.exceptionhandling.entity;

import java.util.Date;

public class EProduct {
	
    private int id;
    private String name;
    private int price;
    private Date dateAdded;  
    
    public int getID() {return this.id; }
    public String getName() { return this.name;}
    public int getPrice() { return this.price;}
    public Date getDateAdded() { return this.dateAdded;}
    
    public void setID(int id) { this.id = id;}
    public void setName(String name) { this.name = name;}
    public void setPrice(int price) { this.price = price;}
    public void setDateAdded(Date date) { this.dateAdded = date;}   

}
