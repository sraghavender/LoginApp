package com.raghavender.javatutorial;

public class LogingService {
	public boolean authenticate(String username, String password) {
		if (password == null || password.trim() == "") {
			return false;
		} else {
			return true;
		}

	}
}
