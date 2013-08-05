package com.example;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class BeerSessionCounter implements HttpSessionListener {
	
	static private int activeSessions;

	public void sessionCreated(HttpSessionEvent event) {
        activeSessions++;
    }

	public void sessionDestroyed(HttpSessionEvent event) {
        activeSessions--;
    }
	
	public static int getActiveSessions(){
		return activeSessions;
	}
	
}
