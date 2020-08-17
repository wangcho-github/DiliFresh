package com.web.DiliFresh.contorller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.DiliFresh.model.bean.User;

@CrossOrigin
@RestController
public class UserController {

	@RequestMapping("addUser")
	public String addUser(User user) {
		User u = new User();
		u.setUsername(user.getUsername());
		u.setPhone(user.getPhone());
		u.setPassword(user.getPassword());
		return "{\"result\":\"success\"}";
	}
}
