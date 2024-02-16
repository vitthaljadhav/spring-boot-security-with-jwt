package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.User;

@Component
public class UserRepository {
	static List<User> ls = null;
	static {
		ls = new ArrayList<User>();
		ls.add(new User("user", "pass123"));

	}

	public User findByUsername(String username) {
		if (username.equals("user"))
			return new User("user", "password");
		else
			return null;
	}
}
