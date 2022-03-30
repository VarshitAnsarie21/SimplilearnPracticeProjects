package com.company.eventhandling.beans;

import org.springframework.context.ApplicationListener;

public class CustomEventListner implements ApplicationListener<CustomEvent> {
    
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}
}
