package com.company.entity;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class EProduct {
	
	private long id;
    private String name;
    private BigDecimal price;
    
    private List<Color> colors;
    private Collection<ScreenSizes> screenSizes;
    private Set<OS> os;
    private Map finance;
    
    public EProduct() {
            
    }
    
    public long getID() {return this.id; }
    public String getName() { return this.name;}
    public BigDecimal getPrice() { return this.price;}
    
    public List<Color> getColors() { return this.colors;}
    public Collection<ScreenSizes> getScreensizes() { return this.screenSizes;}
    public Set<OS> getOs() { return this.os;}
    public Map getFinance() { return this.finance;}
    
    public void setID(long id) { this.id = id;}
    public void setName(String name) { this.name = name;}
    public void setPrice(BigDecimal price) { this.price = price;}
   
    public void setColors(List<Color> colors) { this.colors = colors;}
    public void setScreensizes(Collection<ScreenSizes> sizes) { this.screenSizes = sizes;}
    public void setOs(Set<OS> os) { this.os = os;}
    public void setFinance(Map finance) { this.finance = finance;}


}
