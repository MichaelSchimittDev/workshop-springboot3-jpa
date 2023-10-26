package com.stkdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stkdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
