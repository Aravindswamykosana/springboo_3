package com.jsp.springboo_3.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springboo_3.dto.User;
import com.jsp.springboo_3.repo.UserRepo;
@Repository
public class UserCrud {
	@Autowired
	private UserRepo repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public User fetchUser(int id) {
		Optional<User> db = repo.findById(id);
		if(db.isPresent()){
			return repo.findById(id).get();
		}
		else{
			return null;
		}
	}
}
