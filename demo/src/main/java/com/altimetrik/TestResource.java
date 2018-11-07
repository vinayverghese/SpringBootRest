package com.altimetrik;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestResource {

	@GetMapping("users")
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();

		User u1 = new User();
		u1.setUserId(101);
		u1.setUserName("A");

		User u2 = new User();
		u2.setUserId(102);
		u2.setUserName("B");

		users.add(u1);
		users.add(u2);

		return users;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
