package com.jsp.springboo_3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springboo_3.dto.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
