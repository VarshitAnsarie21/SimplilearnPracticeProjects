package com.company.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eproduct")
public class EProduct {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private long ID;
	
	@Column(name="name")
    private String name;
	
	@Column(name="price")
    private BigDecimal price;
    
    public EProduct() {
            
    }
    
    public EProduct(long id, String name, BigDecimal price) {
            this.ID = id;
            this.name = name;
            this.price = price;
    }
    
    public long getID() {return this.ID; }
    public String getName() { return this.name;}
    public BigDecimal getPrice() { return this.price;}
    
    public void setID(long id) { this.ID = id;}
    public void setName(String name) { this.name = name;}
    public void setPrice(BigDecimal price) { this.price = price;}
}
