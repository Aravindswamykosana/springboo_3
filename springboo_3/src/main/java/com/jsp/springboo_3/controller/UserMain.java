package com.jsp.springboo_3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboo_3.dao.UserCrud;
import com.jsp.springboo_3.dto.User;
@RestController
public class UserMain {
	@Autowired
	private UserCrud crud;
	
	@PostMapping("/saveuser")
	public User save(@RequestBody User user) {
		return crud.saveUser(user);
	}
	
	@GetMapping("/fetchuser")
	public User fetch(@RequestParam int id) {
		return crud.fetchUser(id);
	}
}
