package com.example;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Dog implements HttpSessionBindingListener {
	
	private String breed = "";

	public Dog(String breed){
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}

	public void valueBound(HttpSessionBindingEvent arg0) {
		
	}

	public void valueUnbound(HttpSessionBindingEvent arg0) {
		
	}
}