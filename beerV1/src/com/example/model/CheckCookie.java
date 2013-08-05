package com.example.model;

import javax.servlet.http.Cookie;

public class CheckCookie {
	
	public String getUserName(Cookie[] cookies){
		
		if(cookies != null){
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("username")){
					return cookie.getValue();
				}
			}
		}
		
		return "";
	}

}
